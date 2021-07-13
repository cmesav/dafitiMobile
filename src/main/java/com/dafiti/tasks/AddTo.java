package com.dafiti.tasks;

import com.dafiti.interactions.Swipe;
import com.dafiti.ui.MaleSeccion;
import com.dafiti.ui.NikeResults;
import com.dafiti.ui.Product;
import com.dafiti.ui.ShopingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddTo implements Task {

    private final String product;

    public AddTo(String product) {
        this.product = product;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(MaleSeccion.TENIS, WebElementStateMatchers.isClickable()),
                Swipe.scrollUp(),
                Swipe.scrollUp(),
                Swipe.scrollUp(),
                Click.on(MaleSeccion.NIKE),
                Swipe.scrollUp(),
                Click.on(NikeResults.PRODUCT.of(product)),
                Click.on(Product.BTN_BUY)
        );

        if (NikeResults.CLOSE.resolveFor(actor).isCurrentlyVisible()) {
            NikeResults.CLOSE.resolveFor(actor).click();
        }

        actor.attemptsTo(
                Click.on(ShopingCart.CART)
        );
    }

    public static AddTo cart(String product) {
        return Tasks.instrumented(AddTo.class, product);
    }
}
