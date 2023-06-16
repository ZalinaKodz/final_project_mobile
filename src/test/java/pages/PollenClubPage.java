package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class PollenClubPage {
    public SelenideElement
            acceptButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/acceptButton")),
            permissionButton = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button[1]")),
            allowButton = $(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button")),
            nextButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext"));

    public PollenClubPage givePermissionsAndSkipPages() {
        acceptButton.click();
        permissionButton.click();
        allowButton.click();
        nextButton.click();
        nextButton.click();
        return this;
    }
}
