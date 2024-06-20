package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/Login.feature" ,
        glue = "src/test/java/Steps/WithdrawStepDefn.java"
)

public class TestRunner {
}
