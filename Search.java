package com.quinbay;


import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search {

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
        @FindBy(xpath = "(//div[@class='main-header__tabs']/label)[2]")
        WebElement clickDipatakan;
        @FindBy(xpath = "(//div[@class='main-header__tabs']/label)[1]")
        WebElement clickDispensen;
        @FindBy(xpath = "(//span[@class='order-list__details__status completed'])[1]")
        WebElement firstdipsen;
        @FindBy(xpath = "(//div[@class='order-list__details']/span)[1]")
        WebElement firstdipatakan;
        @FindBy(xpath = "(//i[@class='ticker__icon'])[1]")
        WebElement error;
        @FindBy(xpath = "(//span[@class='order-footer__button'])[1]")
        WebElement orderdetail;
    public void Loginusr(String usr_name){
           // Login_usr.click();
            Login_usr.sendKeys(usr_name);
        }
        public void Loginpass(String pass){
           // Login_pass.click();
            Login_pass.sendKeys(pass);
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
        public void setClickDipesan() throws InterruptedException {
            clickDispensen.click();
            String text=clickDispensen.getText();
            Thread.sleep(3000);
            if(error.isDisplayed()){
                System.out.println("Payment not completed");
               // Assert.assertEquals("123","asddf");
            }
          //  else {
                if (firstdipatakan.isDisplayed()) {
                    String val = firstdipsen.getText();
                    Assert.assertEquals(text, val);
                }
            //}
            System.out.println("Dipesen page");
        }
        public void setClickDipatalkan(){
            clickDipatakan.click();
            String first=(String) clickDipatakan.getText();
            String second=(String) firstdipatakan.getText();
            Assert.assertEquals(first,second);
            System.out.println("Dipatalkan page");
        }
        public void orderdetails(){
            Assert.assertTrue("The value is available",orderdetail.isDisplayed());
            orderdetail.click();
            System.out.println("Order detail page");
        }

}
