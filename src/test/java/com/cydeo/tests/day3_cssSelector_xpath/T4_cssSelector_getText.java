package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordButton=driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedText="Reset password";
        String actualText=resetPasswordButton.getText();

        if (expectedText.equals(actualText)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }
    }
}
