package drivers;

import com.codeborne.selenide.WebDriverProvider;
import configs.EmulatorConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;
import static io.appium.java_client.remote.MobilePlatform.ANDROID;
import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class LocalMobileDriver implements WebDriverProvider {
    public static URL getAppiumServerUrl() {
        try {
            return new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);

        options.setAutomationName(ANDROID_UIAUTOMATOR2)
                .setPlatformName(ANDROID)
                .setDeviceName("Pixel 4 API 30")
                .setPlatformVersion("11.0")
                .setApp(getAppPath())
                .setAppPackage("com.todoist")
                .setAppActivity("com.todoist.alias.HomeActivityDefault");

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private String getAppPath() {
        String appPath = "src/test/resources/app/todoist.apk";

        File app = new File(appPath);
        return app.getAbsolutePath();
    }

}

