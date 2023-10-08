package org.ait.herokuapp.tests.forms;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.forms.FileUploadPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectFileUpload();
    }

    @Test
    public void uploadFileAction() {
        new FileUploadPage(driver).uploadFile("C:/Users/AIT TR Student/Pictures/Saved Pictures/Download.jpg")
                .fileSubmit();
    }

}
