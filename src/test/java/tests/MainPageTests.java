package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {


    @Test
    @DisplayName("Check the symptom")
    public void checkSymptomTest() {
        step("Skip pages", () -> {
                $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
        });
        step("Open symptoms", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1312")).click();
        });
        step("There is symptom 'Itching nose'", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/girlImage")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1001")).shouldHave(Condition.text("Itching nose")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnClose")).click();
        });

    }

    @Test
    @DisplayName("Choose scheme for therapy")
    public void setTherapyScheme() {
        step("Skip pages", () -> {
                $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
        });
        step("Open 'Therapy'", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1312")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnTherapy")).click();
        });
        step("Choose 'Systemic action' ", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/text")).shouldHave(Condition.text("Systemic action")).click();
        });
        step("Choose 'Antihistamines' ", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/text")).shouldHave(Condition.text("Antihistamines (orally)")).click();
        });
        step("Choose medicine ", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/labelName")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1001")).shouldHave(Condition.text("Allegra")).click();
        });
        step("Save scheme  ", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnSave")).click();
        });

    }

    @Test
    @DisplayName("Check text")
    public void checkFenologyPageTest() {
        step("Skip pages", () -> {
                $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")).click();
        });
        step("Open symptoms", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1311")).click();
        });
        step("There is symptom 'Itching nose'", () -> {
                $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1000")).shouldHave(Condition.text("Record birch flowering stage, in order to allow other users have a more accurate picture of pollening, as well as to watch the dynamics of the marks for all the time"));
        });
    }

}
