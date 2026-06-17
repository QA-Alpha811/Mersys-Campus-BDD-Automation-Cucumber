package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.FinancePage;
import pages.HomePage;
import utility.BaseDriver;

public class US_08_09_12_FinanceSteps {

    private static final Logger LOGGER = LogManager.getLogger(US_08_09_12_FinanceSteps.class);
    FinancePage financePage;
    HomePage homePage;
    WebDriver driver;
    @Before
    public void setup() {
         driver = BaseDriver.getDriver();
        financePage = new FinancePage(driver);
        homePage = new HomePage(driver);
    }

    @When("Click on the Hamburger Menu")
    public void click_on_the_hamburger_menu() {
        homePage.clickHamburgerMenu();
        LOGGER.info("Hamburger Menu was clicked");


    }
    @Then("Click on the Finance button")
    public void click_on_the_finance_button() {
        financePage.clickFinance();
        LOGGER.info("Finance button was clicked");
    }
    @Then("Click on the My Finance button")
    public void click_on_the_my_finance_button() {
        financePage.clickMyFinance();
        LOGGER.info("My Finance button was clicked");
    }
    @Then("Verify Finance page opened")
    public void verify_finance_page_opened() {
        financePage.verifyFinancePage();
        LOGGER.info("Finance Page is verified");
    }

    @Then("Click on the Student's Name")
    public void clickOnTheStudentSName() {
       financePage.clickStudent();
       LOGGER.info("Student Table is clicked");
    }

    @Then("Click on the Fee_Balance Detail")
    public void clickOnTheFeeBalanceDetail() {
        financePage.clickFeeBalanceDetailBtn();
        LOGGER.info("Fee Balance Detail was clicked");
    }

    @Then("Verify Installment Table is visible")
    public void verifyInstallmentTableIsVisible() {
       financePage.verifyInsatllmentTableisVisible();
       LOGGER.info("Installment Table is visible");
    }

    @Then("Click on Three Dots on Finance Page")
    public void clickOnThreeDotsOnFinancePage() {
       financePage.clickThreedots();
       LOGGER.info("Three Dots were clicked");
    }

    @Then("Click on Excel Export")
    public void clickOnExcelExport() {
        financePage.clickExcellRepost();
        LOGGER.info("Excel Report was sucessfully clicked");
    }

    @Then("Verify Excel Report was successful")
    public void verifyExcelReportWasSuccessful() {
        financePage.verifyExcellReportWasDownloaded("Students Fees.xlsx");
        LOGGER.info("Excel Report is successfully downloaded");
    }
}
