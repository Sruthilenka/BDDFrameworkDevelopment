package Hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepHooks {
    private static WebDriver driver;

    @Before
    public void setUp(){
        if(driver==null) {
           System.setProperty("webdriver.chrome.driver", "/Users/sruthilenka/Documents/chromedriver");
            driver = new ChromeDriver();
        }
    }

    @After
    public void tearDown(){
        if(driver!=null)
        driver.quit();
        driver=null;
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
