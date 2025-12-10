package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:results/cucumber-html",
                "json:results/cucumber-json/Cucumber.json",
                "junit:results/cucumber-junit/Cucumber.xml",
                "timeline:results/cucumber-timeline",
                "usage:results/cucumber-usage/usage.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true,
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}