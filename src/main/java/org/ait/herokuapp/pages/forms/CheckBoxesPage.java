package org.ait.herokuapp.pages.forms;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends BasePage {

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=checkbox]:nth-child(1)")
    WebElement checkbox1;

    @FindBy(css = "input[type=checkbox]:nth-child(3)")
    WebElement checkbox2;

    public CheckBoxesPage selectCheckbox(String[] checkboxes) {
        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].equals("checkbox 1")) {
                click(checkbox1);
            } if (checkboxes[i].equals("checkbox 2")){
                click(checkbox2);
            }
        }
        return this;
    }

}
