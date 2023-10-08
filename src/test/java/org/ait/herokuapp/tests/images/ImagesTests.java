package org.ait.herokuapp.tests.images;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.images.BrokenImagesPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImagesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBrokenImages();
    }

    @Test
    public void checkBrokenImagesTest() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }
}
