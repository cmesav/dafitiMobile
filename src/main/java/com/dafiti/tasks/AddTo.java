package com.dafiti.tasks;

import com.dafiti.interactions.Swipe;
import com.dafiti.ui.MaleSeccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddTo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(MaleSeccion.TENIS, WebElementStateMatchers.isClickable()),
                Swipe.vertical()
//                Click.on(MaleSeccion.NIKE)
        );
        System.out.println("alto: "+BrowseTheWeb.as(actor).getDriver().manage().window().getSize().getHeight());
    }

    public static AddTo cart(){
        return Tasks.instrumented(AddTo.class);
    }
}
