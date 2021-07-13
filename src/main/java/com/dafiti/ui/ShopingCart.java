package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ShopingCart {

    private ShopingCart() {
    }

    public  static final Target CART = Target.the("Cart")
            .locatedBy("//*[@content-desc='Carrito']");

        public  static final Target PRODUCT = Target.the("Product")
            .locatedBy("(//*[@class='android.widget.TextView'])[2]");



}
