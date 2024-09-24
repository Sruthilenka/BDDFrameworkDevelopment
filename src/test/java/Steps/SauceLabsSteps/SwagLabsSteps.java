package Steps.SauceLabsSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.SauceLabs.SwagLabsLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SwagLabsSteps {
    private WebDriver driver;
    private SwagLabsLoginPage swagLabsLoginPage;

    public SwagLabsSteps() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        this.swagLabsLoginPage = new SwagLabsLoginPage(driver);
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        swagLabsLoginPage.open();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String string) {
        String title = swagLabsLoginPage.title();
        Assert.assertEquals(title, string, "The title doesnt match");
    }

}
