package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;



public class TestBase {
    static String deviceHost = System.getProperty("deviceHost", "browserstack");

    @BeforeAll
    public static void setup() throws Exception {
        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case "emulation":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
            default:
                throw new Exception("Unrecognised deviceHost");
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        String sessionId = sessionId().toString();

        // Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();

        if (deviceHost.equals("browserstack")) {
            Attach.addVideo(sessionId);
        }

    }

}

