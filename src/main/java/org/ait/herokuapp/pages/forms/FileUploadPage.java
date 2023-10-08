package org.ait.herokuapp.pages.forms;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement uploadPicture;

    public FileUploadPage uploadFile(String photoPath) {
        uploadPicture.sendKeys(photoPath);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement submit;

    public FileUploadPage fileSubmit() {
        click(submit);
        return this;
    }
}
