package com.dafiti.tasks;

import com.dafiti.models.RegistrationData;
import com.dafiti.ui.Register;
import com.dafiti.ui.Wellcome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterNew implements Task {

    private final RegistrationData registrationData;

    public RegisterNew(RegistrationData registrationData) {
        this.registrationData = registrationData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GoTo.account(),
                Click.on(Wellcome.GET_IN),
                Click.on(Wellcome.CREATE_ACCOUNT)
        );
        actor.attemptsTo(
                Enter.theValue(registrationData.getEmail()).into(Register.EMAIL),
                Enter.theValue(registrationData.getPassword()).into(Register.PASSWORD),
                Enter.theValue(registrationData.getPassword()).into(Register.PASSWORD_CONFIRMATION),
                Click.on(Register.ID_TYPE_FIELD),
                Click.on(Register.ID_TYPE.of(registrationData.getIdType())),
                Enter.theValue(registrationData.getId()).into(Register.ID_NUMBER),
                Enter.theValue(registrationData.getName()).into(Register.NAME),
                Enter.theValue(registrationData.getLastName()).into(Register.LAST_NAME),
                Enter.theValue(registrationData.getBithDate()).into(Register.BIRTH_DAY),
                Click.on(Register.GENDER_FIELD),
                Click.on(Register.GENDER.of(registrationData.getGender())),
                Click.on(Register.REGISTER_BTN)
        );
    }

    public static RegisterNew account(RegistrationData registrationData){
        return Tasks.instrumented(RegisterNew.class, registrationData);
    }
}
