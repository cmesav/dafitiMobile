package com.dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Register {

    public  static final Target EMAIL = Target.the("Email field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_email']");

    public  static final Target PASSWORD = Target.the("Password field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_password']");

    public  static final Target PASSWORD_CONFIRMATION = Target.the("Password conformation field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_password_confirm']");

    public  static final Target ID_TYPE_FIELD = Target.the("Id type field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_document_type']");

    public  static final Target ID_TYPE = Target.the("Id type")
            .locatedBy("//*[@text='CC']");

    public  static final Target ID_NUMBER = Target.the("Id number field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_identification']");

    public  static final Target NAME = Target.the("Name field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_first_name']");

    public  static final Target LAST_NAME = Target.the("Last name field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_last_name']");

    public  static final Target BIRTH_DAY = Target.the("Birth day field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_birthday']");

    public  static final Target GENDER_FIELD = Target.the("Gender field")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/form_gender']");

    public  static final Target GENDER = Target.the("Select gender {0}")
            .locatedBy("//*[@text='{0}']");

    public  static final Target REGISTER_BTN = Target.the("Gender")
            .locatedBy("//*[@resource-id='br.com.dafiti:id/register_button']");


}
