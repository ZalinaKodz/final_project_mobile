package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class SymptomPage {
    public SelenideElement
            symptomsSection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1312")),
            girlImageButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/girlImage")),
            symptomList = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1001")),
            closeList = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnClose"));

    public SymptomPage openSymptoms() {
        symptomsSection.click();

        return this;
    }

    public SymptomPage checkSymptom(String value) {
        girlImageButton.click();
        symptomList.shouldHave(Condition.text(value)).click();
        closeList.click();

        return this;
    }
}
