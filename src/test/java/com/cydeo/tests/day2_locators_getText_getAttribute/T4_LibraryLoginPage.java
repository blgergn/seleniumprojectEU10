package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement usernameInput=driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        WebElement password=driver.findElement(By.id("inputPassword"));

        password.sendKeys("jfdgkdnfgkdn");

        WebElement signinButton= driver.findElement(By.tagName("button"));
        signinButton.click();




    }
}
