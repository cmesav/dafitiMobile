package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Product {

    private Product() {
    }

    public  static final Target BTN_BUY = Target.the("Button buy")
            .locatedBy("//*[@class='android.widget.Button']");

}
