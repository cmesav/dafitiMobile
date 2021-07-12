package com.dafiti.tasks;

import com.dafiti.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Prueba implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getDriver();
        if (driver.findElement(By.className("android.widget.ListView")).isDisplayed()) {
            actor.attemptsTo(Click.on(Home.BTN_GO_APP));
        }
        actor.attemptsTo(Click.on(Home.MAN));

    }

    public static Prueba pepe() {
        return Tasks.instrumented(Prueba.class);
    }
}
