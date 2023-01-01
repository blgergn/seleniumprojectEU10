package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


    }
}
