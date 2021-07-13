package com.dafiti.stepdefinitions;

import com.dafiti.models.RegistrationData;
import com.dafiti.tasks.AddTo;
import com.dafiti.tasks.GoTo;
import com.dafiti.tasks.RegisterNew;
import com.dafiti.utils.ReturnRandom;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddProductStepdefinitions {

    @When("he creates an account with the data")
    public void heCreatesAnAccountWithTheData(RegistrationData registrationData) {
        theActorInTheSpotlight().attemptsTo(RegisterNew.account(registrationData));
//        System.out.println(ReturnRandom.number());
    }

    @When("add a product to cart")
    public void addAProductToCart() {
        theActorInTheSpotlight().attemptsTo(AddTo.cart());
    }

    @Then("he can see the product in his cart")
    public void heCanSeeTheProductInHisCart() {

    }

}
