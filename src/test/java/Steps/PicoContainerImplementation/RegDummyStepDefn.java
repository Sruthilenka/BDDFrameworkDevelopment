package Steps.PicoContainerImplementation;

import Context.TestContextUI;
import DTOLists.UserDTO;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class RegDummyStepDefn {
    TestContextUI testContextUI;

    //DependencyInjection
    public RegDummyStepDefn(TestContextUI testContextUI) {
        this.testContextUI = testContextUI;
    }
        @Before
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "/Users/sruthilenka/Documents/chromedriver");
            WebDriver driver = new ChromeDriver();
            testContextUI.setDriver(driver);
            testContextUI.initialisePageObjects(driver);
    }

        @Given("I am on the registration page1")
        public void i_am_on_the_registration_page() {
            testContextUI.getDriver().get("https://demo.automationtesting.in/Register.html");

        }

        @When("I entered the valid credentials1")
        public void i_entered_the_valid_credentials(List<UserDTO> users) {
            UserDTO user = users.get(0);
          testContextUI.getRegDummyPage().enterFirstName(user.getFirstName());
            testContextUI.getRegDummyPage().enterLasttName(user.getLastName());
            testContextUI.getRegDummyPage().enterEmail(user.getEmail());
        }

        @When("I submit the registration form1")
        public void i_submit_the_registration_form() {
            testContextUI.getRegDummyPage().RegisterButton();
        }

        @Then("I should see a success message1")
        public void i_should_see_a_success_message() {
            String actual = testContextUI.getRegDummyPage().isSuccessMessageDisplayed();
            String expected = "Succesfully registered";
            Assert.assertEquals(expected, actual, "Unsuccesful");
        }

    }


