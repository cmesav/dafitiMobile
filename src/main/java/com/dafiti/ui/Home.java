package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public  static final Target WELCOME_POP = Target.the("Button Go to app")
            .located(By.className("android.widget.ListView"));

    public  static final Target BTN_GO_APP = Target.the("Button Go to app")
            .locatedBy("//*[@text='IR AL APP']");

    public  static final Target MAN = Target.the("Man section")
            .locatedBy("(//*[@resource-id='br.com.dafiti:id/state_view'])[2]");

    public  static final Target MY_ACCOUNT = Target.the("Man section")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/navigation_account']");


}
