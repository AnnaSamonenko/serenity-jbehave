package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Анна on 25/12/2017.
 */
public class MultiplicationSteps {

    @Steps
    UserSteps user;
    Double firstNumber = 12.33;
    Double secondNumber = 34.43;

    @Given("I have searched for calculator")
    public void givenIHaveSearchedForCalculator() {
        user.search_for_calculator();
    }

    @When("I multiply the numbers")
    public void whenIMultiplyTheNumbers() {
        user.produce_multiplication(firstNumber, secondNumber);
    }

    @Then("I get the composition")
    public void thenIGetTheComposition() {
       user.check_result_multiplication(firstNumber, secondNumber);
    }
}
