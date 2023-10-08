package org.ait.herokuapp.pages;

import org.ait.herokuapp.pages.alertsFrameWindows.FramesPage;
import org.ait.herokuapp.pages.forms.FileUploadPage;
import org.ait.herokuapp.pages.images.BrokenImagesPage;
import org.ait.herokuapp.pages.forms.CheckBoxesPage;
import org.ait.herokuapp.pages.forms.DropDownPage;
import org.ait.herokuapp.pages.widgets.SliderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    WebElement alertsLink;

    public AlertsPage getAlerts() {
        click(alertsLink);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//a[.='Multiple Windows']")
    WebElement windowsLink;

    public WindowPage getMultipleWindows() {
        click(windowsLink);
        return new WindowPage(driver);
    }

    @FindBy(xpath = "//a[.='Form Authentication']")
    WebElement formLink;

    public JSExecutor getFormAuthentication() {
        click(formLink);
        return new JSExecutor(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Broken Images')]")
    WebElement brokenImagesLink;

    public BrokenImagesPage getBrokenImages() {
        click(brokenImagesLink);
        return new BrokenImagesPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Frames')]") //li:nth-child(22)")
    WebElement framesLink;

    public FramesPage getAlertsFramesWindows() {
        clickWithJSExecutor(framesLink, 0, 300);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Horizontal Slider')]")
    WebElement slider;


    public SliderPage selectHorizontalSlider() {
        clickWithJSExecutor(slider, 0, 400);
        return new SliderPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Dropdown')]")
    WebElement dropDown;

    public DropDownPage selectDropDown() {
        clickWithJSExecutor(dropDown, 0, 200);
        return new DropDownPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Checkboxes')]")
    WebElement checkBoxes;

    public CheckBoxesPage selectCheckBoxes() {
        click(checkBoxes);
        return new CheckBoxesPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'File Upload')]")
    WebElement fileUpload;

    public FileUploadPage selectFileUpload() {
        clickWithJSExecutor(fileUpload, 0, 200);
        return new FileUploadPage(driver);
    }
}
