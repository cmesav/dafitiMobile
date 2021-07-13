package com.dafiti.setup.hooks;

import com.dafiti.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class AddProductHook {

    @Before
    public void setUpOneStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Driver.dafiti())));
        OnStage.theActorCalled("Cristian");
    }

    @After
    public void cerrarElEscenario() {
        OnStage.drawTheCurtain();
    }

}
