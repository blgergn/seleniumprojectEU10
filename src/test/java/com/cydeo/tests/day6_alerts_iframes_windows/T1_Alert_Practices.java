package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1() throws InterruptedException {

        WebElement informationAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement information=driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));

        String expectedResult="You successfully clicked an alert";
        String actualResult=information.getText();

        //Assert.assertEquals(expectedResult,actualResult);
        //Failure message will only be displayed if assertion fails:"Result text is NOT displayed"
        Assert.assertTrue(information.isDisplayed(), "Information text is NOT displayed");



    }
}
