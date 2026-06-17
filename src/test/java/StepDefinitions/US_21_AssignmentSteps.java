package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AssignmentPage;
import pages.HomePage;
import pages.MessagingPage;
import utility.BaseDriver;

import java.awt.*;

public class US_21_AssignmentSteps {
    public Logger log = LogManager.getLogger(this.getClass());
    WebDriver driver;
    HomePage homePage;
    AssignmentPage assignmentPage;
    MessagingPage messagingPage;

    @Then("Click assignments button from hamburger menu")
    public void clickAssignmentsButtonFromHamburgerMenu() {
        driver = BaseDriver.getDriver();
        assignmentPage = new AssignmentPage(driver);
        homePage = new HomePage(driver);
        messagingPage = new MessagingPage(driver);
        homePage.clickAssignmentButton();
        log.info("Assignment button is clickable.");
    }

    @And("Verify assignments page opened")
    public void verifyAssignmentsPageOpened() {
        assignmentPage.verifyAssignmentText();
        log.info("Assignment page opened.");
    }

    @Then("Verify submit button is visible next to assignment")
    public void verifySubmitButtonIsVisibleNextToAssignment() {
        assignmentPage.dueDate();
        assignmentPage.startStudyDay();
        assignmentPage.finishStudyDay();
        assignmentPage.verifySubmitButton();
        log.info("submit button is displayed.");
    }

    @And("Click assignment submit icon")
    public void clickAssignmentSubmitIcon() {
        assignmentPage.clickSubmitButton();
        log.info("Submit button is clickable.");
    }

    @Then("Verify assignment submission popup opened")
    public void verifyAssignmentSubmissionPopupOpened() {
        assignmentPage.verifySubmissionAttemptText();
        log.info("The submission popup opened");
    }

    @And("Write text{string} in assignment editor")
    public void writeTextInAssignmentEditor(String message) {
        messagingPage.clickTextEditor();
        messagingPage.enterMessageBody(message);
        log.info("The message sent successfully");
    }

    @And("Paste text into editor")
    public void pasteTextIntoEditor() {
        messagingPage.selectAllTextInEditor();
        messagingPage.copyTextInEditor();
        messagingPage.pasteTextInEditor();
    }

    @And("Add image or table into editor")
    public void addImageOrTableIntoEditor() {
        messagingPage.clickTableIcon();
        messagingPage.createTable(3, 4);
        log.info("The table has been created.");
    }

    @Then("Attach file to assignment")
    public void attachFileToAssignment() throws AWTException {
        assignmentPage.clickAttachFilesButton();
        assignmentPage.clickFromLocal();
        assignmentPage.attachFile();
        log.info("");
    }

    @And("Save assignment as draft")
    public void saveAssignmentAsDraft() {
        assignmentPage.saveButton();
        log.info("File uploaded successfully.");
    }

    @Then("Verify success message displayed for draft save")
    public void verifySuccessMessageDisplayedForDraftSave() {
        assignmentPage.verifySuccesfullysave();
        log.info("Assignment has been saved as a draft.");
    }

    @And("Click submit assignment button")
    public void clickSubmitAssignmentButton() {
        assignmentPage.clickLastSubmitButton();
        log.info("Submit assignment button clicked.");
    }

    @Then("Verify confirmation popup opened")
    public void verifyConfirmationPopupOpened() {
        assignmentPage.verifyConfirmText();
        log.info("Verified that the confirmation popup is displayed.");
    }

    @When("Approve assignment submission")
    public void approveAssignmentSubmission() {
        assignmentPage.yesButton();
        log.info("The assignment submission was approved successfully.");
    }

    @Then("Verify success message displayed for submission")
    public void verifySuccessMessageDisplayedForSubmission() {
        assignmentPage.verifySuccesfullySend();
        log.info("Verified the success message displayed for the submission.");
    }


}
