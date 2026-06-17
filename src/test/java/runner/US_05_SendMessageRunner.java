package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/US_05_SendMessage.feature",
        glue = {"StepDefinitions", "hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class US_05_SendMessageRunner extends AbstractTestNGCucumberTests {
}
