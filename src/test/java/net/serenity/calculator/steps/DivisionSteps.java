package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Анна on 25/12/2017.
 */
public class DivisionSteps {

    @Steps
    UserSteps user;
    Double firstNumber = 12.3984;
    Double secondNumber = 34.343;

    @Given("I have searched for calculator")
    public void givenIHaveSearchedForCalculator() {
        user.search_for_calculator();
    }

    @When("I devide the numbers")
    public void whenIDevideTheNumbers() {
        user.produce_division(firstNumber, secondNumber);
    }

    @Then("I get the quotient")
    public void thenIGetTheQuotient() {
        user.check_result_division(firstNumber, secondNumber);
    }
}
