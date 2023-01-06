package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

        WebDriver driver;
        @BeforeMethod
        public void setupMethod(){
            driver= WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://practice.cydeo.com/iframe");
        }
        @Test
        public void iframe_test(){

            //We need to switch driver's focus to iframe
            driver.switchTo().frame(0);
            //option1 : switching to iframe using id attribute value
            //driver.switchTo().frame("mce_0_ifr");
            WebElement textPart=driver.findElement(By.xpath("//p"));

            Assert.assertTrue(textPart.isDisplayed());

        }
}
