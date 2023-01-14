package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {


    @Test
    public void crm_login_test(){
        driver.get("https://login1.nextbasecrm.com/");
        WebElement inputUsername=driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");


        WebElement inputPassword=driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        inputPassword.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test_2(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver);
        BrowserUtils.verifyTitle(driver,"Portal");
    }
    @Test
    public void crm_login_test_3(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com","UserUser");
        BrowserUtils.verifyTitle(driver,"(1) Portal");
    }


}
