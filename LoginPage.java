package com.quinbay.test.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@class='form__input login__username']")
    WebElement Login_usr;
    @FindBy(xpath = "//input[@class='form__input login__password']")
    WebElement Login_pass;
    @FindBy(xpath = "//button[@class='blu-btn b-full-width b-secondary']")
    WebElement submit;
    @FindBy(xpath = "//button[@class='blu-btn otp-validation__button b-full-width b-secondary']")
    WebElement verify_email;
    @FindBy(xpath = "(//ul//li//input)[1]")
    WebElement otp1;
    @FindBy(xpath = "(//ul//li//input)[2]")
    WebElement otp2;
    @FindBy(xpath = "(//ul//li//input)[3]")
    WebElement otp3;
    @FindBy(xpath = "(//ul//li//input)[4]")
    WebElement otp4;
    @FindBy(xpath = "//button[@class='blu-btn otp__confirm-button b-full-width b-secondary']")
    WebElement otpsubmit;
    public void Login(String usr_name,String password){
        Login_usr.sendKeys(usr_name);
        Login_pass.sendKeys(password);
    }
    public void Submit(){
        submit.click();
    }
    public void setVerify_email(){
        verify_email.click();
    }
    public void setotp(String otp){
       // otp1.click();
        otp1.sendKeys(""+otp.charAt(0));
        //otp2.click();
        otp2.sendKeys(""+otp.charAt(1));
        //otp3.click();
        otp3.sendKeys(""+otp.charAt(2));
        //otp4.click();
        otp4.sendKeys(""+otp.charAt(3));
        otpsubmit.click();
    }
}
