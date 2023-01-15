package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //Find some small file from your computer, and get the path of it.
        String path ="/Users/bilge/Desktop/HTML Class/rogerfederer.jpg.webp";

        //Upload the file.
        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

    }
}
