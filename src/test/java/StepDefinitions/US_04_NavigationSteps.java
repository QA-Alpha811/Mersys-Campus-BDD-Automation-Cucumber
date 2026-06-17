package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.MessagingPage;
import utility.BaseDriver;

import java.util.List;

public class US_04_NavigationSteps {

    private MessagingPage page;
    private static final Logger LOGGER = LogManager.getLogger(US_04_NavigationSteps.class);

    @Before
    public void setup() {
        WebDriver driver = BaseDriver.getDriver();
        this.page = new MessagingPage(driver);
    }

    @When("Click Hamburger Menu icon")
    public void clickHamburgerMenuIcon() {
        LOGGER.info("Clicking hamburger menu icon");
        page.clickHamburgerMenu();
    }

    @When("Hover over {string} link")
    public void hoverOverLink(String linkName) {
        LOGGER.info("Hovering over {} link", linkName);
        page.hoverOverMessagingLink();
    }

    @Then("See all 4 submenu links")
    public void seeAllSubmenuLinks(DataTable dataTable) {
        List<String> links = dataTable.asList();
        for (String link : links) {
            assert page.isSubmenuLinkVisible(link) : "Link not visible: " + link;
            LOGGER.info("{} is visible", link);
        }
    }

    @When("Click {string} link")
    public void clickLink(String linkName) {
        LOGGER.info("Clicking {} link", linkName);
        switch (linkName) {
            case "Mesaj Gönder":
                page.clickNewMessageOption();
                break;
            case "Gelen Kutusu":
                page.clickInboxOption();
                break;
            case "Giden Kutusu":
                page.clickOutboxOption();
                break;
            case "Çöp":
                page.clickTrashOption();
                break;
        }
    }

    @Then("New Message page opens")
    public void newMessagePageOpens() {
        page.verifyNewMessagePageDisplayed();
        LOGGER.info("New Message page opened");
    }

    @Then("Text editor is displayed")
    public void textEditorIsDisplayed() {
        page.verifyTextEditorPresent();
        LOGGER.info("Text editor is displayed");
    }

    @Then("Inbox page opens")
    public void inboxPageOpens() {
        page.verifyInboxPageDisplayed();
        LOGGER.info("Inbox page opened");
    }

    @Then("Outbox page opens")
    public void outboxPageOpens() {
        page.verifyOutboxPageDisplayed();
        LOGGER.info("Outbox page opened");
    }

    @Then("Trash page opens")
    public void trashPageOpens() {
        page.verifyTrashPageDisplayed();
        LOGGER.info("Trash page opened");
    }

    @Then("Message list is displayed")
    public void messageListIsDisplayed() {
        page.verifyMessageListDisplayed();
        LOGGER.info("Message list is displayed");
    }
}