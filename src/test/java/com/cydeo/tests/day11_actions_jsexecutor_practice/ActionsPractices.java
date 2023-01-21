package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5_test(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        Actions actions=new Actions(Driver.getDriver());

        //Locating CYDEO link to be able to pass in the actions method
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).perform();







    }




}
