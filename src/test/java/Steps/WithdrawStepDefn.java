package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.WithdrawAmount;

public class WithdrawStepDefn {
    private WithdrawAmount account;
    private boolean withdraw;

    @Given("I have an ${int} in the account")
    public void i_have_an_$_in_the_account(Double balance) {
        this.account = new WithdrawAmount(balance);
    }

    @When("I have withdrawn ${int} from the account")
    public void i_have_withdrawn_$_from_the_account(Double amount) {
        this.withdraw = account.withdraw(amount);
    }

    @Then("Money should be dispensed from the account")
    public void money_should_be_dispensed_from_the_account() {
        if (withdraw) {
            System.out.println("Money is dispensd");
        } else {
            System.out.println("Money is not dispensed");
        }

    }


}
