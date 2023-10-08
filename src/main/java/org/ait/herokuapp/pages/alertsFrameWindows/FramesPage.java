package org.ait.herokuapp.pages.alertsFrameWindows;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Nested Frames')]")
    WebElement nestedFramesLink;

    public NestedFramesPage returnNestedFrames() {
        click(nestedFramesLink);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement iFramesLink;

    public IframePage returnIFrames() {
        click(iFramesLink);
        return new IframePage(driver);
    }
}
