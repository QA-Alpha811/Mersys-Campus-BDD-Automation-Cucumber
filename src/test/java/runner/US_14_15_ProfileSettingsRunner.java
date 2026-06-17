package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/US_14_15_profile.feature",
        glue = {"StepDefinitions", "Hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class US_14_15_ProfileSettingsRunner extends AbstractTestNGCucumberTests {
}
