package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class PollenClubPage {
    public SelenideElement
            acceptButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/acceptButton")),
            permissionButton = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button[1]")),
            allowButton = $(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button")),
            nextButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/buttonNext")),
            chosenAllergen = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id4001")),
            mapSelection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1314")),
            notationPage = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnInfo")),
            descriptionLink = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnGuide")),
            closeButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnCloseInfo")),
            symptomsSection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1312")),
            girlImageButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/girlImage")),
            symptomList = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1001")),
            closeList = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnClose")),
            therapySection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnTherapy")),
            chooseSystemicAction = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/text")),
            chooseAntihistamine = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/text")),
            chooseDrugName = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/labelName")),
            setAllegraButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1001")),
            saveSchemeButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnSave")),
            fenologyPage = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1311")),
            instractionForSection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1000"));

    public PollenClubPage skipFirstPage() {
        acceptButton.click();
        permissionButton.click();
        allowButton.click();
        nextButton.click();
        nextButton.click();
        return this;
    }

    public PollenClubPage checkMainAllergen() {
        chosenAllergen.shouldHave(Condition.text("Birch"));
        return this;
    }

    public PollenClubPage openMapSection() {
        mapSelection.click();
        return this;
    }

    public PollenClubPage openNotations() {
        notationPage.click();
        return this;
    }

    public PollenClubPage checkLink() {
        descriptionLink.shouldHave(Condition.text("Detailed map description here"));
        return this;
    }

    public PollenClubPage closeNotations() {
        closeButton.click();
        return this;
    }

    public PollenClubPage openSymptoms() {
        symptomsSection.click();
        return this;
    }

    public PollenClubPage checkSymptom() {
        girlImageButton.click();
        symptomList.shouldHave(Condition.text("Itching nose")).click();
        closeList.click();
        return this;
    }

    public PollenClubPage openTherapy() {
        symptomsSection.click();
        therapySection.click();
        return this;
    }

    public PollenClubPage chooseAction() {
        chooseSystemicAction.shouldHave(Condition.text("Systemic action")).click();
        return this;
    }

    public PollenClubPage setAntihistamines() {
        chooseAntihistamine.shouldHave(Condition.text("Antihistamines (orally)")).click();
        return this;
    }

    public PollenClubPage chooseDrug() {
        chooseDrugName.click();
        setAllegraButton.shouldHave(Condition.text("Allegra")).click();
        return this;
    }

    public PollenClubPage saveScheme() {
        saveSchemeButton.click();
        return this;
    }

    public PollenClubPage openFenologyPage() {
        fenologyPage.click();
        return this;
    }

    public PollenClubPage checkInstruction() {
        instractionForSection.shouldHave(Condition.text("Record birch flowering stage, in order to allow other users have a more accurate picture of pollening, as well as to watch the dynamics of the marks for all the time"));
        return this;
    }
}
