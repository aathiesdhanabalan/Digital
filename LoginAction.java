package com.quinbay.test.Actions;

import com.quinbay.test.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginAction {

    public LoginPage page;
    public LoginAction(WebDriver driver){
        page=PageFactory.initElements(driver,LoginPage.class);
    }
    public void Login(String usr_name,String password){
        page.Login(usr_name,password);
        page.Submit();
    }
    public void verifyemail(String otp){
        page.setVerify_email();
        page.setotp(otp);
    }
}
