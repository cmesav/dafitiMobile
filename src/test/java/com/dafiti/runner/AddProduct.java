package com.dafiti.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_product.feature",
        glue = {"com.dafiti.setup", "com.dafiti.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")
public class AddProduct {
}
