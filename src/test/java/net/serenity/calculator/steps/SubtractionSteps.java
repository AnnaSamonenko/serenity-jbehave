package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Анна on 25/12/2017.
 */
public class SubtractionSteps {
    @Steps
    UserSteps user;
    Double firstNumber = 12.2;
    Double secondNumber = 34.9;

    @Given("I have searched for calculator")
    public void givenIHaveSearchedForCalculator() {
        user.search_for_calculator();
    }

    @When("I do subtraction of numbers")
    public void whenIDoSubtractionOfNumbers() {
        user.produce_subtraction(firstNumber, secondNumber);
    }

    @Then("I get the difference")
    public void thenIGetTheDifference() {
        user.check_result_subtraction(firstNumber, secondNumber);
    }

}
