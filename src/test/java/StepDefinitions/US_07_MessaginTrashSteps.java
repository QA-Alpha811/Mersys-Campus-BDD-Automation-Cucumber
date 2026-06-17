package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.MessagingPage;
import utility.BaseDriver;

public class US_07_MessaginTrashSteps {

    private MessagingPage page;
    private static final Logger LOGGER = LogManager.getLogger(US_07_MessaginTrashSteps.class);

    @Before
    public void setup() {
        WebDriver driver = BaseDriver.getDriver();
        this.page = new MessagingPage(driver);
    }

    @And("Deleted messages list is displayed")
    public void deletedMessagesListIsDisplayed() {
        page.verifyMessageListDisplayed();
        LOGGER.info("Deleted messages list is displayed");
    }

    @And("Restore and Delete icons should be visible and clickable")
    public void restoreAndDeleteIconsShouldBeVisibleAndClickable() {
        page.verifyRestoreAndDeleteIconsVisible();
        LOGGER.info("Restore and Delete icons are visible and clickable");
    }

    @When("Click restore icon for first message")
    public void clickRestoreIconForFirstMessage() {
        LOGGER.info("Clicking restore icon for first message");
        page.clickRestoreIconForFirstMessage();
    }

    @And("Message should be restored successfully")
    public void messageShouldBeRestoredSuccessfully() {
        page.verifySuccessMessageDisplayed();
        LOGGER.info("Message was restored successfully");
    }

    @And("Message should be permanently deleted")
    public void messageShouldBePermanentlyDeleted() {
        page.verifySuccessMessageDisplayed();
        LOGGER.info("Message was permanently deleted");
    }

    @When("Click Cancel button")
    public void clickCancelButton() {
        LOGGER.info("Clicking Cancel button");
        page.clickCancelButton();
    }

    @Then("Message should remain in Trash")
    public void messageShouldRemainInTrash() {
        page.verifyMessageListDisplayed();
        LOGGER.info("Message remained in Trash");
    }
}
