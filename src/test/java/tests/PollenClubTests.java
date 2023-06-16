package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

public class PollenClubTests extends TestBase {
    String mainAllergen = "Birch";
    String notationLink = "Detailed map description here";
    String symptom = "Itching nose";
    String systemicAction = "Systemic action";
    String takingMedication = "Antihistamines (orally)";
    String drugName = "Allegra";
    String instructionText = "Record birch flowering stage, in order to allow other users have a more accurate picture of pollening, as well as to watch the dynamics of the marks for all the time";

    PollenClubPage pollenClubPage = new PollenClubPage();
    ForecastPage forecastPage = new ForecastPage();
    RiskMapPage riskMapPage = new RiskMapPage();
    SymptomPage symptomPage = new SymptomPage();
    TherapyPage therapyPage = new TherapyPage();
    FenologyPage fenologyPage = new FenologyPage();

    @Test
    @DisplayName("Check if there is 'Birch' in list")
    void checkInListTest() {
        step("Allow permission and skip first pages", () ->
                pollenClubPage.givePermissionsAndSkipPages());
        step("Check Birch in list", () ->
                forecastPage.checkMainAllergen(mainAllergen));
    }

    @Test
    @DisplayName("Check Risk Map")
    public void checkRiskMapTest() {
        step("Allow permission and skip first pages", () ->
                pollenClubPage.givePermissionsAndSkipPages());
        step("Open map", () ->
                riskMapPage.openMapSection());
        step("Open notation'", () ->
                riskMapPage.openNotations());
        step("Check that notation has link 'Detailed map description here'", () ->
                riskMapPage.checkLink(notationLink));
        step("Close notation", () ->
                riskMapPage.closeNotations());
    }

    @Test
    @DisplayName("Check the symptom")
    public void checkSymptomTest() {
        step("Allow permission and skip first pages", () ->
                pollenClubPage.givePermissionsAndSkipPages());
        step("Open symptoms", () ->
                symptomPage.openSymptoms());
        step("Check that there is symptom 'Itching nose' in list", () ->
                symptomPage.checkSymptom(symptom));
    }

    @Test
    @DisplayName("Choose scheme for therapy")
    public void setTherapyScheme() {
        step("Allow permission and skip first pages", () ->
                pollenClubPage.givePermissionsAndSkipPages());
        step("Open 'Therapy'", () ->
                therapyPage.openTherapy());
        step("Choose 'Systemic action' ", () ->
                therapyPage.chooseAction(systemicAction));
        step("Choose 'Antihistamines' ", () ->
                therapyPage.setAntihistamines(takingMedication));
        step("Choose medicine", () ->
                therapyPage.chooseDrug(drugName));
        step("Save scheme", () ->
                therapyPage.saveScheme());
    }

    @Test
    @DisplayName("Check text")
    public void checkFenologyPageTest() {
        step("Allow permission and skip first pages", () ->
                pollenClubPage.givePermissionsAndSkipPages());
        step("Open fenology section ", () ->
                fenologyPage.openFenologyPage());
        step("Check that there is instruction", () ->
                fenologyPage.checkInstruction(instructionText));
    }
}
