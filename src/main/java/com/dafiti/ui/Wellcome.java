package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Wellcome {

    private Wellcome() {
    }

    public  static final Target GET_IN = Target.the("Get in")
            .locatedBy("(//*[@resource-id='br.com.dafiti:id/label'])[1]");

        public  static final Target CREATE_ACCOUNT = Target.the("GoTo account")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/create_account']");


}
