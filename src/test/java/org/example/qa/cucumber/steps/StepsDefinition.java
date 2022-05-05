package org.example.qa.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.qa.cucumber.test.TestBase;


public class StepsDefinition extends TestBase {

    @Before
    public void init() {
        start();
    }

    @After
    public void tearDown() {
        finish();
    }

    @Given("I go to main page")
    public void iGoToMainPage() {
        loginPage.goTo();
    }

    @When("^I login as \"([^\"]*)\" with email \"([^\"]*)\"$")
    public void iLoginAsWithEmail(String login, String password) {
        loginPage.checkAllElementsOnPagePresent()
                .typeLogin(login)
                .typeEmail(password)
                .loginButtonClick();
    }

    @Then("^I should see the client name \"([^\"]*)\"$")
    public void iShouldSeeTheClientName(String name)  {
        loginPage.isLoginCorrect();
    }
}
