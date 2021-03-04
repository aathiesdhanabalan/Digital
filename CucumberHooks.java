package com.quinbay.Steps;

import com.quinbay.utilclass.Driverclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {
    static WebDriver driver;

    public static WebDriver getdriver() {
        return driver;
    }

    @Before
    public void testBefore(){
        Driverclass obj=new Driverclass();
        driver=obj.setupDriver();
        System.out.println("This is a demo of before hook");
    }
    @After
    public void testAfter(){
        driver.quit();
        System.out.println("This is a demo of after hook");
    }

}
