package com.dafiti.stepdefinitions;

import com.dafiti.models.RegistrationData;
import com.dafiti.questions.TheProduct;
import com.dafiti.tasks.AddTo;
import com.dafiti.tasks.RegisterNew;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class AddProductStepdefinitions {

    @When("he creates an account with the data")
    public void heCreatesAnAccountWithTheData(RegistrationData registrationData) {
        theActorInTheSpotlight().attemptsTo(RegisterNew.account(registrationData));
    }

    @And("add the product {string} to cart")
    public void addTheProductToCart(String product) {
        theActorInTheSpotlight().attemptsTo(AddTo.cart(product));
    }

    @Then("he can see the product {string} in his cart")
    public void heCanSeeTheProductInHisCart(String producto) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheProduct.is(), equalTo(producto)));

    }
}
