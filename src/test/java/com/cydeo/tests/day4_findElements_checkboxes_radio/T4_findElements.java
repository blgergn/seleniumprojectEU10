package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra wait time for our driver before it throws NoSuchElementExpection
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        //print out the text of the links. (iter)

        for (WebElement each : allLinks) {

            System.out.println("Text of Link: "+ each.getText());
            System.out.println("HREF values: "+ each.getAttribute("href"));

            }
    }
}
