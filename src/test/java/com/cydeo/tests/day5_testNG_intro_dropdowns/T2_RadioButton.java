package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyButton=driver.findElement(By.xpath("//input[@id='hockey']"));

        Thread.sleep(2000);
        hockeyButton.click();

        System.out.println("hockeyButton.isSelected(), expecting true = " + hockeyButton.isSelected());
    }
}
