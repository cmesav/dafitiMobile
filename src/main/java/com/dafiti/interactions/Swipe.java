package com.dafiti.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Swipe implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int puntoXMedio = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().getHeight() / 2;
        int puntoYMedio = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().getWidth() / 2;

        int cuartoy = puntoYMedio / 2;
        new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver())
                .press(PointOption.point(puntoXMedio, puntoYMedio))
                .moveTo(PointOption.point(puntoXMedio, cuartoy))
                .release().perform();
    }

    public static Swipe vertical() {
        return Tasks.instrumented(Swipe.class);
    }
}
