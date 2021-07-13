package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NikeResults {

    private NikeResults() {
    }

    public  static final Target PRODUCT = Target.the("Nike product {0}")
            .locatedBy("//*[contains(@text,'{0}')]");

    public  static final Target CLOSE = Target.the("Close")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/dialog_size_selection_close']");


}
