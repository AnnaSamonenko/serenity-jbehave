package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Анна on 25/12/2017.
 */
public class DivisionByZeroSteps {

    @Steps
    UserSteps user;
    Double firstNumber = 12.202;
    Double secondNumber = 0.0;

    @Given("I have searched for calculator")
    public void givenIHaveSearchedForCalculator() {
        user.search_for_calculator();
    }

    @When("I devide by zero")
    public void whenIDevideByZero() {
        user.produce_division(firstNumber, secondNumber);
    }

    @Then("I get infinity")
    public void thenIGetInfinity() {
        user.check_result_division(firstNumber, secondNumber);
    }
}
