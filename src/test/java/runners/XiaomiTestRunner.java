package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/xiaomi",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:results/xiaomi-tests/cucumber-html",
                "json:results/xiaomi-tests/cucumber-json/Cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true
)
public class XiaomiTestRunner extends AbstractTestNGCucumberTests {
}