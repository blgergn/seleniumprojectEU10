package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeButton = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeButton="Remember me on this computer";
        String actualRememberMeButton =rememberMeButton.getText();

        if (expectedRememberMeButton.equals(actualRememberMeButton)){
            System.out.println("First task PASSED!");
        }else{
            System.out.println("Sorry,FAILED!");
        }

        WebElement forgotPasswordButton = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordButton="Forgot your password?";
        String actualForgotPasswordButton=forgotPasswordButton.getText();

        if (actualForgotPasswordButton.equalsIgnoreCase(expectedForgotPasswordButton)){
            System.out.println("Congrats, second task is PASSED!");
        }else{
            System.out.println("actualForgotPasswordButton = " + actualForgotPasswordButton);
            System.out.println("expectedForgotPasswordButton = " + expectedForgotPasswordButton);
            System.out.println("Sorry, second task is FAILED!");
        }

        String expectedInHref="forgot_password=yes";
        String actualHrefAttributeValue=forgotPasswordButton.getAttribute("href");

        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("Last task is PASSED!");
        }else{
            System.out.println("Sorry, last task is FAILED!");
        }

    }
}
