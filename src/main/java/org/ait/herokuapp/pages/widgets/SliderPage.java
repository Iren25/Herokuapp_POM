package org.ait.herokuapp.pages.widgets;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[('range')]")
    WebElement slider;

    public SliderPage moveSliderHorizontalDirection() {
        pause(500);
        new Actions(driver).dragAndDropBy(slider, 64, 0).perform();
        return this;
    }

    @FindBy( id = "range")
    WebElement range;

    public SliderPage assertSliderValue(String number) {
        Assert.assertEquals(getValueAttribute(range, "range"),number);
        return this;
    }

    public String getValueAttribute(WebElement element, String name) {
        pause(500);
        return element.getAttribute(name);
    }
}
