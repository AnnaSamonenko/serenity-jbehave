package net.serenity.calculator.steps.serenity;

import net.serenity.calculator.pages.GoogleCalculatorPage;
import net.serenity.calculator.pages.GoogleSearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class UserSteps {

    @Steps
    GoogleSearchPage searchPage;

    @Steps
    GoogleCalculatorPage calculatorPage;

    @Step
    public void search_for_calculator() {
        searchPage.open();

        searchPage.searchForString("calculator");
        try {
            searchPage.submitForm();
        } catch (Exception ex) {
            // Some logger need to be here
        }
        searchPage.titleShouldMatch("calculator");
    }

    @Step
    public void produce_addition(double num1, double num2) {

        calculatorPage.addition(num1, num2);
    }

    @Step
    public void produce_subtraction(double num1, double num2) {
        calculatorPage.subtraction(num1, num2);
    }

    @Step
    public void produce_division(double num1, double num2) {
        calculatorPage.division(num1, num2);
    }

    @Step
    public void produce_multiplication(double num1, double num2) {
        calculatorPage.multiplication(num1, num2);
    }

    @Step
    public void check_result_addition(double num1, double num2) {
        calculatorPage.checkResult(num1 + num2);
    }

    @Step
    public void check_result_subtraction(double num1, double num2) {
        calculatorPage.checkResult(num1 - num2);
    }

    @Step
    public void check_result_multiplication(double num1, double num2) {
        calculatorPage.checkResult(num1 * num2);
    }

    @Step
    public void check_result_division(double num1, double num2) {
        calculatorPage.checkResult(num1 / num2);
    }
}