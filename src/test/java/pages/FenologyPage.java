package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class FenologyPage {
    public SelenideElement

            fenologyPage = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1311")),
            instractionForSection = $(AppiumBy.id("pollen.sgolovanov.pollen2:id/id1000"));

    public FenologyPage openFenologyPage() {
        fenologyPage.click();

        return this;
    }

    public FenologyPage checkInstruction(String value) {
        instractionForSection.shouldHave(Condition.text(value));

        return this;
    }
}
