package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/google",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:results/google-tests/cucumber-html",
                "json:results/google-tests/cucumber-json/Cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true
)
public class GoogleTestRunner extends AbstractTestNGCucumberTests {
}