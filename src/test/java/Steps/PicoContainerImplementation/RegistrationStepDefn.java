package Steps.PicoContainerImplementation;

import DTOLists.UserDTO;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PicoImplementationPages.RegistrationPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class RegistrationStepDefn {
    RegistrationPageObject registrationPageObject;
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/sruthilenka/Documents/chromedriver");
        driver = new ChromeDriver();
        registrationPageObject = new RegistrationPageObject(driver);
    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver.get("https://demo.automationtesting.in/Register.html");

    }

    @When("I entered the valid credentials")
    public void i_entered_the_valid_credentials(List<UserDTO> users) {
        UserDTO user = users.get(0);
        registrationPageObject.enterFirstName(user.getFirstName());
        registrationPageObject.enterLasttName(user.getLastName());
        registrationPageObject.enterEmail(user.getEmail());
    }

    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        registrationPageObject.RegisterButton();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        String actual = registrationPageObject.isSuccessMessageDisplayed();
        String expected = "Succesfully registered";
        Assert.assertEquals(expected, actual, "Unsuccesful");
    }

}
