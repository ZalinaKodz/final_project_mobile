package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class ForecastPage {
    public SelenideElement
            chosenAllergen = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id4001"));

    public ForecastPage checkMainAllergen(String value) {
        chosenAllergen.shouldHave(Condition.text(value));
        return this;
    }
}
