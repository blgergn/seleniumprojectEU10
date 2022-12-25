package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        if (driver.getCurrentUrl().contains("cydeo")){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is FAILED!");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("TEST İS PASSED!");
        }

        driver.close();


    }
}
