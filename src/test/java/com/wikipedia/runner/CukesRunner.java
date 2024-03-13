package com.wikipedia.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/wikipedia/step_definitions",
        dryRun = false,
        tags ="@scenariooutline" ,
        publish = true

)

public class CukesRunner {
}
