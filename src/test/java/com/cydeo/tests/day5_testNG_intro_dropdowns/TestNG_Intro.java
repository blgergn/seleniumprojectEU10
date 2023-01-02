package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("--->BeforeClass is running !");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--->AfterClass is running!!");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--->Before method is running !");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--->After method is running !");
    }

    @Test (priority = 2)
    public void test1(){
        System.out.println("Test 1 is running...");

    }
    @Test (priority = 1)
    public void test2(){
        System.out.println("Test 2 is running...");

    }


}
