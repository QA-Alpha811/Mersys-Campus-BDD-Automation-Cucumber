package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.MessagingPage;
import utility.BaseDriver;

public class US_05_SendMessageSteps {

    private MessagingPage page;
    private static final Logger LOGGER = LogManager.getLogger(US_05_SendMessageSteps.class);

    @Before
    public void setup() {
        WebDriver driver = BaseDriver.getDriver();
        this.page = new MessagingPage(driver);
    }


    @When("Click Receivers icon")
    public void clickReceiversIcon() {
        LOGGER.info("Clicking receivers icon");
        page.clickReceiversIcon();
    }

    @Then("Recipient panel opens")
    public void recipientPanelOpens() {
        page.verifyRecipientPanelDisplayed();
        LOGGER.info("Recipient panel opened");
    }

    @When("Type {string} in recipient search")
    public void typeInRecipientSearch(String searchTerm) {
        LOGGER.info("Typing in recipient search: {}", searchTerm);
        page.searchRecipientByTerm(searchTerm);
    }

    @Then("Recipient list is filtered")
    public void recipientListIsFiltered() {
        page.verifyRecipientListFiltered();
        LOGGER.info("Recipient list is filtered");
    }

    @When("Select {string}")
    public void selectRecipient(String recipientName) {
        LOGGER.info("Selecting recipient: {}", recipientName);
        page.selectRecipientOption(recipientName);
    }

    @When("Close recipient panel")
    public void closeRecipientPanel() {
        LOGGER.info("Closing recipient panel");
        page.closeRecipientPanel();
    }

    @Then("{string} appears in recipients field")
    public void appearInRecipientsField(String recipientName) {
        page.verifyRecipientDisplayedInField(recipientName);
        LOGGER.info("{} appears in recipients field", recipientName);
    }

    @When("Enter subject {string}")
    public void enterSubject(String subject) {
        LOGGER.info("Entering subject: {}", subject);
        page.clickSubjectField();
        page.enterSubject(subject);
    }

    @When("Enter message body {string}")
    public void enterMessageBody(String message) {
        LOGGER.info("Entering message body");
        page.clickTextEditor();
        page.enterMessageBody(message);
    }

    @When("Select all text")
    public void selectAllText() {
        LOGGER.info("Selecting all text");
        page.selectAllTextInEditor();
    }

    @When("Copy text")
    public void copyText() {
        LOGGER.info("Copying text");
        page.copyTextInEditor();
    }

    @When("Paste text")
    public void pasteText() {
        LOGGER.info("Pasting text");
        page.pasteTextInEditor();
    }

    @When("Click Table icon")
    public void clickTableIcon() {
        LOGGER.info("Clicking table icon");
        page.clickTableIcon();
    }

    @When("Create {int}x{int} table")
    public void createTable(int rows, int cols) {
        LOGGER.info("Creating {}x{} table", rows, cols);
        page.createTable(rows, cols);
    }

    @When("Click Attach Files")
    public void clickAttachFiles() {
        LOGGER.info("Clicking attach files");
        page.clickAttachFilesIcon();
    }

    @When("Select file from my files")
    public void selectFileFromMyFiles() {
        LOGGER.info("Selecting file from my files");
        page.selectFileFromMyFiles();
    }

    @When("Select first file from list")
    public void selectFirstFileFromList() {
        page.selectFirstFileFromList();
        LOGGER.info("File selected and attached");
    }

    @When("Click Send button")
    public void clickSendButton() {
        LOGGER.info("Clicking send button");
        page.clickSendButton();
    }

    @Then("Success message appears")
    public void successMessageAppears() {
        page.verifySuccessMessageDisplayed();
        LOGGER.info("Success message appeared");
    }

    @When("Navigate to Outbox")
    public void navigateToOutbox() {
        LOGGER.info("Navigating to Outbox");
        page.clickHamburgerMenu();
        page.hoverOverMessagingLink();
        page.clickOutboxOption();
    }

    @Then("Message {string} appears in list")
    public void messageAppearsInList(String messageSubject) {
        page.verifyMessageInList(messageSubject);
        LOGGER.info("Message '{}' appears in list", messageSubject);
    }
}