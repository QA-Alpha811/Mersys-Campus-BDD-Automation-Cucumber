package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features/US_12_Finance.feature",
        glue = {"StepDefinitions", "hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class US_12_FinanceRunner extends AbstractTestNGCucumberTests {
}
