package org.ait.herokuapp.tests.forms;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.forms.CheckBoxesPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectCheckBoxes();
    }

    @Test
    public void selectCheckbox(){
        String[] checkboxesToSelect = {"checkbox 1", "checkbox 2"};
        new CheckBoxesPage(driver).selectCheckbox(checkboxesToSelect);
    }


}
