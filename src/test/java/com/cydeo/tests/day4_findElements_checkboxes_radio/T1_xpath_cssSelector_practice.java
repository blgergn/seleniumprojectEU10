package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link'"));

        WebElement forgotPasswordHeader=driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));


    }



}
