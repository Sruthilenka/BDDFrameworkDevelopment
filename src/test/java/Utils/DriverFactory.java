package Utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    public WebDriver driver;
    public ThreadLocal<WebDriver> tldriver = new ThreadLocal();

    public WebDriver init_driver(){

        return getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
