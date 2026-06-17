package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import utility.BaseDriver;

import java.util.List;

public class US_03_HomeSteps {
    private Logger log = LogManager.getLogger(this.getClass());
    WebDriver driver;
    HomePage homePage;

    @When("The user examines the main menu items one by one, clicks on each one, and confirms that they have been clicked.")
    public void theUserExaminesTheMainMenuItemsOneByOneClicksOnEachOneAndConfirmsThatTheyHaveBeenClicked(DataTable dataTable) {
        driver = BaseDriver.getDriver();
        homePage = new HomePage(driver);

        List<String> links = dataTable.asList(String.class);

        for (String link : links) {

            log.info("▶ Clicking menu: " + link);

            switch (link) {

                case "Logo":
                    homePage.clickTechnoStudyWebsite();

                    String mainWindow = driver.getWindowHandle();
                    for (String w : driver.getWindowHandles()) {
                        if (!w.equals(mainWindow)) {
                            driver.switchTo().window(w);
                            break;

                        }
                    }
                    driver.close();
                    driver.switchTo().window(mainWindow);
                    break;

                case "Classes":
                    homePage.clickCoursesButton();
                    driver.navigate().back();
                    break;

                case "Calendar":
                    homePage.clickCalendarButton();
                    break;

                case "Attendance":
                    homePage.clickAttendanceButton();
                    break;

                case "Assignments":
                    homePage.clickAssignmentButton();
                    break;

                case "Grading":
                    homePage.clickGradingButton();
                    break;

                case "Notification":
                    homePage.clicknotificationButton();
                    driver.navigate().back();
                    break;

                case "Messages":
                    homePage.clickMessageButton();
                    driver.navigate().back();
                    break;

                case "Profile":
                    homePage.clickProfileButton();
                    driver.navigate().back();
                    break;

                default:
                    throw new RuntimeException("Unknown menu: " + link);
            }

        }
    }
}