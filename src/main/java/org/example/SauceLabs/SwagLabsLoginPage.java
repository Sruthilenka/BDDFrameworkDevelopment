package org.example.SauceLabs;

import org.example.Base.BaseClass;
import org.openqa.selenium.WebDriver;

public class SwagLabsLoginPage {
private WebDriver driver;
    public SwagLabsLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        System.out.println("Page is opened");
    }

    public String title(){
       String title = driver.getTitle();
       return title;
    }
}
