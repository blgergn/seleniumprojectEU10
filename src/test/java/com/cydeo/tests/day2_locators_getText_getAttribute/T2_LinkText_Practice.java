package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }
        Thread.sleep(3000);
        driver.navigate().back();

        String expectedTitle2 = "Practice";
        String actualTitle2=driver.getTitle();

        if (expectedTitle2.equals(actualTitle2)){
            System.out.println("Everything is OKEY!");
        }else{
            System.out.println("I am SORRY!");
        }

    }
}
