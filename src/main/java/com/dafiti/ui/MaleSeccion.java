package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MaleSeccion {

    private MaleSeccion() {
    }

    public  static final Target TENIS = Target.the("TENIS section")
            .locatedBy("(//*[@class='android.widget.ImageView'])[3]");

    public  static final Target NIKE = Target.the("NIKE section")
            .locatedBy("//*[contains(@text,'NIKE')]");

}
