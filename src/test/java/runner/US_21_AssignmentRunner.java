package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/US_18_20_21_22_assignment.feature",

        },
        glue = {"StepDefinitions", "hooks"},
        tags = "@Assignment21",
        plugin = {"pretty", "html:target/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class US_21_AssignmentRunner extends AbstractTestNGCucumberTests {
}
