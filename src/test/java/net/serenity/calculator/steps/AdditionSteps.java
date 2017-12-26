package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AdditionSteps {

    @Steps
    UserSteps user;
    Double firstNumber = 46.0;
    Double secondNumber = 67.0;

    @Given("I have searched for calculator")
    public void givenIHaveSearchedForCalculator() {
        user.search_for_calculator();
    }

    @When("I add the numbers")
    public void whenIAddTheNumbers() {
        user.produce_addition(firstNumber, secondNumber);
    }

    @Then("I get the sum")
    public void thenIGetTheSum() {
        user.check_result_addition(firstNumber, secondNumber);
    }

}

