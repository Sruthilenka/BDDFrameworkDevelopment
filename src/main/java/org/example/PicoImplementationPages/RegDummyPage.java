package org.example.PicoImplementationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegDummyPage {

        private WebDriver driver;

        public RegDummyPage(WebDriver driver) {
            this.driver = driver;
        }
        //Locators
        private By firstNameInput = By.xpath("//input[@ng-model='FirstName']");
        private By lastNameInput = By.xpath("//input[@ng-model='LastName']");
        private By emailInput = By.xpath("//input[@type='email']");
        private By RegisterButtonInput = By.xpath("//button[contains(text(),'Submit')]");
        private By successMessage = By.xpath("//input[@type='email']"); //placeholder

        // //button[text()=' Submit '] or //button[contains(text(),'submit')]
        public void enterFirstName(String firstName) {
            WebElement firstNameElement = driver.findElement(firstNameInput);
            firstNameElement.sendKeys(firstName);
        }

        public void enterLasttName(String lastName) {
            WebElement lastNameElement = driver.findElement(lastNameInput);
            lastNameElement.sendKeys(lastName);
        }
        public void enterEmail(String email) {
            WebElement emailElement = driver.findElement(emailInput);
            emailElement.sendKeys(email);
        }
        public void RegisterButton() {
            WebElement buttonElement = driver.findElement(RegisterButtonInput);
            buttonElement.click();
        }
        public String isSuccessMessageDisplayed(){
            WebElement successMessageDisplayed = driver.findElement(successMessage);
            String actual_message = successMessageDisplayed.getText();
            return actual_message;
        }
    }


