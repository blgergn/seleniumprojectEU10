package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test(){

        //Storing the main page's window handle as string is good practice for future re-usable purposes
        String mainHandle=driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("Title before click:" +actualTitle);

        WebElement clickhereButton=driver.findElement(By.linkText("Click Here"));
        clickhereButton.click();

        for (String each:driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+ driver.getTitle());
        }

        String expectedTitleAfterClick="New Window";
        actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);
        System.out.println("Title after click: " + actualTitle);

        // if we want to go back to main page, we can use already stored main handle
        //driver.switchTo().window(mainHandle);
    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
}
