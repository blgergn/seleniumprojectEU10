package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @Test
    public void required_field_error_message_test(){

        Driver.getDriver().get("https://library1.cydeo.com/");

       libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
        Driver.getDriver().get("https://library1.cydeo.com/");

       libraryLoginPage=new LibraryLoginPage();

        libraryLoginPage.inputUsername.sendKeys("lkfdngdlfgdflk");

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void library_negative_login_test(){
        Driver.getDriver().get("https://library1.cydeo.com/");

        libraryLoginPage=new LibraryLoginPage();

        libraryLoginPage.inputUsername.sendKeys("anyway@dfsdfjsl.com");

        libraryLoginPage.inputPassword.sendKeys("kjfkdfgkdngkdjnf");

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

        Driver.closeDriver();
    }
}
