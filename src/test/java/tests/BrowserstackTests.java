package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class BrowserstackTests extends TestBase {
    @Test
    @DisplayName("Check if there is 'Birch' in list")
    void checkInListTest() {
        step("Allow permission and navigate to the list", () -> {
            $(AppiumBy.id("pollen.sgolovanov.pollen2:id/acceptButton")).click();
            $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button[1]")).click();
            $(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
            $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
            $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
        });

        step("Check Birch in list", () -> {
            $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id4001")).shouldHave(Condition.text("Birch"));

        });
    }

    @Test
    @DisplayName("Check Risk Map")
    public void checkRiskMapTest() {
        step("Skip pages", () ->
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/acceptButton")).click());
                $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button[1]")).click();
                $(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
        step("Open map", () ->
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1314")).click());
        step("Open notation'", () ->
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnInfo")).click());
        step("Check that notation has link 'Detailed map description here'", () ->
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnGuide")).shouldHave(Condition.text("Detailed map description here")));
        step("Close notation", () ->
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnCloseInfo")).click());
    }

}
