package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText=driver.findElement(By.tagName("h2"));

        String expectedHeaderText="Registration form";
        String actualHeaderText=headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }

        WebElement firstnameInput=driver.findElement(By.name("firstname"));

        String expectedPlaceHolder="first name";
        String actualPlaceHolder=firstnameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("PASSED AGAIN!");
        }else{
            System.out.println("SOMETHING IS WRONG!");
        }

        driver.close();




            }
}
