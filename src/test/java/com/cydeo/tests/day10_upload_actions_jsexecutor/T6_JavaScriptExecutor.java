package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T6_JavaScriptExecutor {

    @Test
    public void javascript_executor_test1(){

        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");


    }
}
