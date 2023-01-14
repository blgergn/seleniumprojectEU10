package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){
       // Driver.getDriver() ---> driver.get(url)
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker=new Faker();

        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@placeholder='first name']"));
        inputFirstName.sendKeys(faker.name().firstName());

        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//input[@placeholder='last name']"));
        inputLastName.sendKeys(faker.name().lastName());

        WebElement inputUsername=Driver.getDriver().findElement(By.xpath("//input[@placeholder='username']"));
        inputUsername.sendKeys(faker.name().username());
    }
}
