package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AssignmentPage;
import pages.HomePage;
import utility.BaseDriver;

public class US_22_AssignmentSteps {
    public Logger log = LogManager.getLogger(this.getClass());
    WebDriver driver;
    AssignmentPage assignmentPage;
    HomePage homePage;


    @When("The student clicks the assignments button on the hamburger menu.")
    public void theStudentClicksTheAssignmentsButtonOnTheHamburgerMenu() {
        driver = BaseDriver.getDriver();

        assignmentPage = new AssignmentPage(driver);
        homePage = new HomePage(driver);

        homePage.clickAssignmentButton();
        log.info("Assignment button is clickable.");
    }

    @Then("The student sees the search button on the Assign page and clicks on it.")
    public void theStudentSeesTheSearchButtonOnTheAssignPageAndClicksOnIt() {

        assignmentPage.searchButton();
        log.info("Search button is clickable.");
    }

    @When("the student performs a search without applying any filters \\(Default Search), all assigned tasks are listed.")
    public void theStudentPerformsASearchWithoutApplyingAnyFiltersDefaultSearchAllAssignedTasksAreListed() {
        assignmentPage.defaultViewSelect();
        log.info("Default view select is clickable");

        assignmentPage.selectDefaultView();

        log.info("Default view select is clickable");
    }

    @Then("The student filters the search \\(Course, Status, Semester).")
    public void theStudentFiltersTheSearchCourseStatusSemester()  {
        assignmentPage.classSelect();
        log.info("Class select is clickable");
        assignmentPage.mehmetSimsekSelect();
        log.info("Study name is clickable");
        assignmentPage.statusSelect();
        log.info("Status select is clickable");
        assignmentPage.resultsPublishedSelect();
        log.info("The results have been published and selected.");
        assignmentPage.statusSelect();
        log.info("Status select is clickable");
        assignmentPage.dueDate();
        log.info("Due date is clickable.");
        assignmentPage.startStudyDay();
        log.info("The start date has been selected.");

        assignmentPage.finishStudyDay();
        log.info("The finish date has been selected.");
        assignmentPage.searchButton();
        log.info("Search button is clickable");
    }


}
