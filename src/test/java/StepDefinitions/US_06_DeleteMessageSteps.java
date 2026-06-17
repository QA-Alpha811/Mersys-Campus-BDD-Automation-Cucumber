package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.MessagingPage;
import utility.BaseDriver;

public class US_06_DeleteMessageSteps {

    private MessagingPage page;
    private static final Logger LOGGER = LogManager.getLogger(US_06_DeleteMessageSteps.class);

    @Before
    public void setup() {
        WebDriver driver = BaseDriver.getDriver();
        this.page = new MessagingPage(driver);
    }


    @When("Click trash icon for first message")
    public void clickTrashIconForFirstMessage() {
        LOGGER.info("Clicking trash icon for first message");
        page.clickTrashIcon();
    }

    @Then("Delete confirmation appears")
    public void deleteConfirmationAppears() {
        page.verifyDeleteConfirmationDisplayed();
        LOGGER.info("Delete confirmation appeared");
    }

    @When("Click Yes button")
    public void clickYesButton() {
        LOGGER.info("Clicking Yes button");
        page.clickConfirmYesButton();
    }

    @When("Refresh page")
    public void refreshPage() {
        LOGGER.info("Clicking refresh icon");
        page.clickRefreshIcon();
        LOGGER.info("Page refreshed");
    }
}