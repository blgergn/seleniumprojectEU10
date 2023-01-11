package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class t4_Config_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //We are getting the browserType dynamically from our configuration.properties file
        String  browserType= ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }

    @Test
    public void google_search_test(){

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        String expectedTitle= "apple - Google'da Ara";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);


    }
}
