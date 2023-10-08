package org.ait.herokuapp.tests.alertsFrameWindows;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.alertsFrameWindows.FramesPage;
import org.ait.herokuapp.pages.alertsFrameWindows.IframePage;
import org.ait.herokuapp.pages.alertsFrameWindows.NestedFramesPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFramesWindows();
    }

    @Test
    public void framesTest() {
        //new HomePage(driver).selectFrame();
        new FramesPage(driver).returnNestedFrames();
        new NestedFramesPage(driver).returnListOfFrames();
    }

    @Test
    public void iframesTest(){
        new FramesPage(driver).returnIFrames();
        new IframePage(driver).returnIframesList();
    }
}
