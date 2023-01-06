package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void dropDown() throws InterruptedException {

        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        String expectedSelect="California";
        String actualSelect=stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedSelect,actualSelect);

    }

    @Test
    public void fullDropdown(){
    Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@id='day']")));

    monthDropdown.selectByValue("11");
    yearDropdown.selectByVisibleText("1924");
    dayDropdown.selectByIndex(0);





    }

}
