package org.ait.herokuapp.pages.alertsFrameWindows;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "frame")
    List<WebElement> nestedFrames;

    public NestedFramesPage returnListOfFrames() {
        System.out.println("The total numbers of frames: " + nestedFrames.size());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("The total numbers of frames: " + numberOfFrames);
        return this;
    }
}
