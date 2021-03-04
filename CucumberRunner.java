package com.quinbay;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/destination/cucumber.json","pretty", "html:target/cucumber/report.html"},
        features = "src/test/resources/Features",
        tags="@LoginFeature",
        glue = {"com.quinbay.Steps"}
)
public class CucumberRunner {
}
