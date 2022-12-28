package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement loginButton=driver.findElement(By.name("USER_LOGIN"));
        loginButton.sendKeys("incorrect");

        WebElement passwordButton=driver.findElement(By.name("USER_PASSWORD"));
        passwordButton.sendKeys("incorrect");

        WebElement enterButton = driver.findElement(By.className("login-btn"));
        enterButton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedMessage="Incorrect login or password";
        String actualErrorMessage=errorMessage.getText();

        if (expectedMessage.equals(actualErrorMessage)){
            System.out.println("PASSED!");
        }else{
            System.out.println("Sorry,FAILED!");
        }










    }
}
