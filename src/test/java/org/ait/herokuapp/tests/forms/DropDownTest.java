package org.ait.herokuapp.tests.forms;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.forms.DropDownPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectDropDown();
    }

    @Test
    public void selectOptionTest() {
        new DropDownPage(driver).selectOption("Option 1");
    }
}
