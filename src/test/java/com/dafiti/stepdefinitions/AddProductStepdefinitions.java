package com.dafiti.stepdefinitions;

import com.dafiti.tasks.Prueba;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddProductStepdefinitions {

    @Given("the client is in the app")
    public void theClientIsInTheApp() {

    }

    @When("add a product to cart")
    public void addAProductToCart() {
        theActorInTheSpotlight().attemptsTo(Prueba.pepe());
    }

    @When("he creates an account")
    public void heCreatesAnAccount() {

    }

    @Then("he can see the product in his cart")
    public void heCanSeeTheProductInHisCart() {

    }

}
