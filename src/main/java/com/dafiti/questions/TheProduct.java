package com.dafiti.questions;

import com.dafiti.ui.ShopingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return ShopingCart.PRODUCT.resolveFor(actor).getText();
    }

    public static TheProduct is(){
        return new TheProduct();
    }

}
