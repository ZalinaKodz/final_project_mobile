package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class RiskMapPage {
    public SelenideElement
            mapSelection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1314")),
            notationPage = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnInfo")),
            descriptionLink = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnGuide")),
            closeButton = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/btnCloseInfo"));

    public RiskMapPage openMapSection() {
        mapSelection.click();

        return this;
    }

    public RiskMapPage openNotations() {
        notationPage.click();

        return this;
    }

    public RiskMapPage checkLink(String value) {
        descriptionLink.shouldHave(Condition.text(value));

        return this;
    }

    public RiskMapPage closeNotations() {
        closeButton.click();

        return this;
    }
}
