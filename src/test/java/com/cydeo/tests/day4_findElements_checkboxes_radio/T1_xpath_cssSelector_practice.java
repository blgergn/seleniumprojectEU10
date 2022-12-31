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
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink3 = driver.findElement(By.cssSelector("a.[href='/']"));

        WebElement forgotPasswordHeader=driver.findElement(By.cssSelector("div.example>h2"));

        WebElement forgotPasswordHeader2=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement forgotPasswordHeader3=driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailText=driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailText2=driver.findElement(By.xpath("//label[@for='email']"));

        WebElement inputbox=driver.findElement(By.xpath("//input[@type='text']"));
        WebElement inputbox2=driver.findElement(By.xpath("//input[contains(@pattern,'a-z']"));

        WebElement retrievePassword=driver.findElement(By.cssSelector("i.icon-2x"));

        WebElement retrievePassword2=driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement cydeoText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        WebElement cydeoText2=driver.findElement(By.cssSelector("div[style='text-align: center;']"));

    }



}
