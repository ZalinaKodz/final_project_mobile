package tests;

import com.codeborne.selenide.Configuration;
import drivers.BrowserstackDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;



public class TestBase {
    static String driver = System.getProperty("mobileDeviceHost", "browserstack");

    @BeforeAll
    public static void setup() {
        if (driver.equals("browserstack")) {
            Configuration.browser = BrowserstackDriver.class.getName();
        } else if (driver.equals("emulation")) {
            Configuration.browser = LocalMobileDriver.class.getName();
        } else {
            throw new RuntimeException("Incorrect stand name");
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId().toString();

        // Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();

        if (driver.equals("browserstack")) {
            Attach.addVideo(sessionId);
        }
    }
}
//}

