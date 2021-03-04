package com.quinbay.utilclass;

import com.quinbay.Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Orderpage {

    public Search page;
    public Orderpage(WebDriver driver){
        page= PageFactory.initElements(driver,Search.class);
    }
    public void clickDipesan() throws InterruptedException {
        page.setClickDipesan();
    }
    public void setClickDipat(){
        page.setClickDipatalkan();
        page.orderdetails();
    }
}
