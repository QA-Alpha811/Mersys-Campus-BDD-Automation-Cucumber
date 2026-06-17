package StepDefinitions;

import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AssignmentPage;
import pages.HomePage;
import utility.BaseDriver;


public class US_18_AssignmentSteps {
    public Logger log = LogManager.getLogger(this.getClass());
    WebDriver driver;
    HomePage homePage;
    AssignmentPage assignmentPage;


    @When("The student sees the assignment button.")
    public void theStudentSeesTheAssignmentButton() {
        driver = BaseDriver.getDriver();
        homePage = new HomePage(driver);
        assignmentPage = new AssignmentPage(driver);

        homePage.verifyAssignmentButton();
        log.info("Assignment button is displayed");
    }

    @When("the student hovers over the assignment button, they see the number of assignments.")
    public void theStudentHoversOverTheAssignmentButtonTheySeeTheNumberOfAssignments() {
        homePage.hoverOverAssignment();
        assignmentPage.verifyAssignmentNumber();
        log.info("hover over done");
        log.info("assignment number checked");
    }

    @When("the student clicks on the assignment button, they see their assignments.")
    public void theStudentClicksOnTheAssignmentButtonTheySeeTheirAssignments() {
        homePage.clickAssignmentButton();
        assignmentPage.verifyAssignmentText();
        log.info("The assignment button was pressed and the assignments were checked.");
    }
}
