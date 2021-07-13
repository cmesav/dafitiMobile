package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ResultsPage {

    private ResultsPage() {
    }

    public  static final Target JUST_DO_IT = Target.the("Just Do It T-shirt")
            .locatedBy("//*[contains(@text,'Just Do It')]");
}
