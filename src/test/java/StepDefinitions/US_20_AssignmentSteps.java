package StepDefinitions;

import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AssignmentPage;
import pages.HomePage;
import utility.BaseDriver;

public class US_20_AssignmentSteps {
    public Logger log = LogManager.getLogger(this.getClass());
    WebDriver driver;
    HomePage homePage;
    AssignmentPage assignmentPage;

    @Then("The student clicks the assignments button on the hamburger menu")
    public void theStudentClicksTheAssignmentsButtonOnTheHamburgerMenu() {
        driver = BaseDriver.getDriver();

        assignmentPage = new AssignmentPage(driver);
        homePage = new HomePage(driver);

        homePage.clickAssignmentButton();
        log.info("Assignment button is clikable.");

    }

    @Then("The student clicks the i button to the right of the assignments on the assignment list")
    public void theStudentClicksTheIButtonToTheRightOfTheAssignmentsOnTheAssignmentList() {
        assignmentPage.dueDate();
        assignmentPage.startStudyDay();
        assignmentPage.finishStudyDay();
        assignmentPage.iIcon();
        assignmentPage.driverNavigateBack();
        log.info("I icon is clikable.");
    }

    @Then("The student clicks the favorite button to the right of the assignments on the assignment list")
    public void theStudentClicksTheFavoriteButtonToTheRightOfTheAssignmentsOnTheAssignmentList() {
        assignmentPage.starButton();
        log.info("Favorite button is clickable.");

    }
}

