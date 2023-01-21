package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void task7_scroll_test() {

        Driver.getDriver().get("https://practice.cydeo.com/large");
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        //Down-casting our driver type to JavascriptExecutor, so we are able to use the methods coming from that interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        BrowserUtils.sleep(2);
        //js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
    }

}
