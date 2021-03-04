package com.quinbay.utilclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Driverclass {

    public  WebDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver=new ChromeDriver(cap);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://wwwuata.gdn-app.com/member/order/digital/completed");
        return driver;
    }
}
