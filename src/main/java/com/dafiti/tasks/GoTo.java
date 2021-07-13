package com.dafiti.tasks;

import com.dafiti.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        if (Home.WELCOME_POP.resolveFor(actor).isCurrentlyVisible()) {
            Home.BTN_GO_APP.resolveFor(actor).click();
        }
        actor.attemptsTo(
                Click.on(Home.MAN),
                Click.on(Home.MY_ACCOUNT)
        );

    }

    public static GoTo account() {
        return Tasks.instrumented(GoTo.class);
    }
}
