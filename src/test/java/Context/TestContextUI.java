package Context;

import org.example.PicoImplementationPages.RegDummyPage;
import org.example.PicoImplementationPages.SignInPage;
import org.openqa.selenium.WebDriver;

public class TestContextUI {
    WebDriver driver;
    RegDummyPage regDummyPage;
    SignInPage signInPage;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public RegDummyPage getRegDummyPage() {
        return regDummyPage;
    }

    public void setRegDummyPage(RegDummyPage regDummyPage) {
        this.regDummyPage = regDummyPage;
    }

    public SignInPage getSignInPage() {
        return signInPage;
    }

    public void setSignInPage(SignInPage signInPage) {
        this.signInPage = signInPage;
    }

    public void initialisePageObjects(WebDriver driver){
        regDummyPage = new RegDummyPage(driver);
        signInPage = new SignInPage(driver);
    }
}
