package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PollenClubPage;

import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class PollenClubTests extends TestBase {

    PollenClubPage pollenClubPage = new PollenClubPage();
    @Test
    @DisplayName("Check if there is 'Birch' in list")
    void checkInListTest() {
        step("Allow permission and navigate to the list", () ->
                pollenClubPage.skipFirstPage());
        step("Check Birch in list", () ->
                pollenClubPage.checkMainAllergen());
    }

    @Test
    @DisplayName("Check Risk Map")
    public void checkRiskMapTest() {
        step("Skip pages", () ->
                pollenClubPage.skipFirstPage());
        step("Open map", () ->
                sleep(10000));
        pollenClubPage.openMapSection();
        step("Open notation'", () ->
                pollenClubPage.openNotations());
        step("Check that notation has link 'Detailed map description here'", () ->
                pollenClubPage.checkLink());
        step("Close notation", () ->
                pollenClubPage.closeNotations());
    }

    @Test
    @DisplayName("Check the symptom")
    public void checkSymptomTest() {
        step("Skip pages", () ->
                pollenClubPage.skipFirstPage());
        sleep(15000);
        step("Open symptoms", () ->
                pollenClubPage.openSymptoms());
        step("Check that there is symptom 'Itching nose' in list", () ->
                pollenClubPage.checkSymptom());
    }

    @Test
    @DisplayName("Choose scheme for therapy")
    public void setTherapyScheme() {
        step("Skip pages", () ->
                pollenClubPage.skipFirstPage());
        sleep(10000);
        step("Open 'Therapy'", () ->
                pollenClubPage.openTherapy());
        step("Choose 'Systemic action' ", () ->
                pollenClubPage.chooseAction());
        step("Choose 'Antihistamines' ", () ->
                pollenClubPage.setAntihistamines());
        step("Choose medicine ", () ->
                pollenClubPage.chooseDrug());
        step("Save scheme  ", () ->
                pollenClubPage.saveScheme());
    }

    @Test
    @DisplayName("Check text")
    public void checkFenologyPageTest() {
        step("Skip pages", () ->
                pollenClubPage.skipFirstPage());
        sleep(10000);
        step("Open fenology section ", () ->
                pollenClubPage.openFenologyPage());
        step("Check that there is instruction", () ->
                pollenClubPage.checkInstruction());
    }
}
