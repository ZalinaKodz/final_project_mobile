package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class TherapyPage {
    public SelenideElement
            symptomsSection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1312")),
            therapySection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnTherapy")),
            chooseSystemicAction = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/text")),
            chooseAntihistamine = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/text")),
            chooseDrugName = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/labelName")),
            setAllegraButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1001")),
            saveSchemeButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnSave"));

    public TherapyPage openTherapy() {
        symptomsSection.click();
        therapySection.click();

        return this;
    }

    public TherapyPage chooseAction(String value) {
        chooseSystemicAction.shouldHave(Condition.text(value)).click();

        return this;
    }

    public TherapyPage setAntihistamines(String value) {
        chooseAntihistamine.shouldHave(Condition.text(value)).click();

        return this;
    }

    public TherapyPage chooseDrug(String value) {
        chooseDrugName.click();
        setAllegraButton.shouldHave(Condition.text(value)).click();

        return this;
    }

    public TherapyPage saveScheme() {
        saveSchemeButton.click();

        return this;
    }
}
