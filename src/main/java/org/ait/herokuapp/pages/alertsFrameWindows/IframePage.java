package org.ait.herokuapp.pages.alertsFrameWindows;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IframePage extends BasePage {
    public IframePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    List<WebElement> iframes;

    public IframePage returnIframesList() {
        System.out.println("The total numbers of iframes: " + iframes.size());
        return this;
    }
}
