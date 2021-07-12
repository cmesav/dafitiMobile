package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Wellcome {

    public  static final Target GET_IN = Target.the("Get in")
            .locatedBy("//*[@text='Entrar']");

        public  static final Target CREATE_ACCOUNT = Target.the("Create account")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/create_account']");


}
