package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utility.BaseDriver;

public class US_02_HomeSteps {
    public Logger log = LogManager.getLogger(this.getClass());
    WebDriver driver;
    HomePage homePage;

    @Given("The user should see the company logo on the top left")
    public void theUserShouldSeeTheCompanyLogoOnTheTopLeft() {
        driver= BaseDriver.getDriver();
        homePage=new HomePage(driver);

        homePage.verifyTechnoStudyWebsite();
        log.info("Techno study button is clickable.");

    }

    @When("The user clicks on the company logo")
    public void theUserClicksOnTheCompanyLogo() {
        homePage.clickTechnoStudyWebsite();
        log.info("Techno study website is opened");
    }

    @Then("The user should be redirected to {string}")
    public void theUserShouldBeRedirectedTo(String link) {
        String currentWindow = driver.getWindowHandle();

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        homePage.verifyTechnoStudyPageOpened();
        log.info("Techno study website is opened.");
    }
}
