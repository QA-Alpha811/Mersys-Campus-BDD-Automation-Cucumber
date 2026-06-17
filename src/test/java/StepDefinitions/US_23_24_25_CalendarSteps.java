package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.CalendarPage;
import utility.BaseDriver;

public class US_23_24_25_CalendarSteps {


    private static final Logger log = LoggerFactory.getLogger(US_23_24_25_CalendarSteps.class);
    CalendarPage calendarPage;

    @Before
    public void setup() {
        WebDriver driver = BaseDriver.getDriver();
        this.calendarPage = new CalendarPage(driver);
    }

    //Us-23

    @When("Click on the Calendar menu and verify that the page is displayed")
    public void clickOnTheCalendarMenuAndVerifyThatThePageIsDisplayed() {
        calendarPage.clickCalendarButton();
        calendarPage.verifyCalenderPage();
        calendarPage.verifyWeeklyDateRange();
    }

    @Then("Review the courses listed on the calendar and check the course status icons")
    public void reviewTheCoursesListedOnTheCalendarAndCheckTheCourseStatusIcons() {
        calendarPage.verifyPYayinlandi();
        calendarPage.verifySBasladi();
        calendarPage.verifyEBitti();
        calendarPage.verifyCİptalEdildi();
    }

    @Then("On the Calendar page, you can see the weekly course plan and calendar page links, and click on these links")
    public void onTheCalendarPageYouCanSeeTheWeeklyCoursePlanAndCalendarPageLinksAndClickOnTheseLinks() {
        calendarPage.clickCalendarButton();
        calendarPage.clickAcademicCalenderBtn();
        calendarPage.clickWeeklyLessonPlanBtn();
    }

    @Then("Visibility and clickability of the Previous, Today, and Next icons")
    public void visibilityAndClickabilityOfThePreviousTodayAndNextIcons() {
        calendarPage.verifyNextİcon();
        calendarPage.clickNextBtn();

        calendarPage.verifyPreviousİcon();
        calendarPage.clickPreviousBtn();

        calendarPage.verifyTodayİcon();
        calendarPage.clickTodayBtn();
    }

    @Then("The visibility and clickability of lessons on the weekly course schedule page")
    public void theVisibilityAndClickabilityOfLessonsOnTheWeeklyCourseSchedulePage() {
        calendarPage.verifyWeeklyCourseSchedule();
        calendarPage.clickFirstCourse();
        calendarPage.verifyWarningText();
        calendarPage.closeWarningText();
    }

    //Us-24

    @When("Clickable access to a course on the Weekly Course Plan page and access to information about that course")
    public void clickableAccessToACourseOnTheWeeklyCoursePlanPageAndAccessToInformationAboutThatCourse() {

        calendarPage.verifyCourseInfTable();
    }

    @Then("A course that has not yet been published is clicked, a pop-up window may appear containing information about the course")
    public void aCourseThatHasNotYetBeenPublishedIsClickedAPopUpWindowMayAppearContainingInformationAboutTheCourse() {
        calendarPage.verifyCourseNameOnTable();
        calendarPage.verifyTeacherNameOnTable();
        calendarPage.verifyCourseDateOnTable();
        calendarPage.verifyCourseStartTimeOnTable();
        calendarPage.verifyCourseNotStartedSignOnTable();

        calendarPage.closeInfoTable();

    }

    @Then("Click on a published \\(P), started \\(S), or finished \\(E) course and check if the information screen can be opened")
    public void clickOnAPublishedPStartedSOrFinishedECourseAndCheckIfTheInformationScreenCanBeOpened() {
        calendarPage.clickPreviousBtnFourTimes();
        calendarPage.clickCourse();
        calendarPage.verifyInfTable();
        calendarPage.verifyAndClickInformationBtn();
        calendarPage.verifyAndClickTopicBtn();
        calendarPage.verifyAndClickAttachmentBtn();
        calendarPage.verifyAndClickRecentEventsBtn();
    }

    //Us25

    @When("A completed lesson \\(E) is clicked, a link to access the lesson video should open and be clickable")
    public void aCompletedLessonEIsClickedALinkToAccessTheLessonVideoShouldOpenAndBeClickable() {
        calendarPage.verifySaveBtn();
    }


    @Then("Checking the clickability of the save button and access to the lesson video")
    public void checkingTheClickabilityOfTheSaveButtonAndAccessToTheLessonVideo() {
        calendarPage.clickSaveBtn();
        calendarPage.verifyVideoScreenOpen();
    }

    @Then("close page")
    public void closePage() {
        calendarPage.closepage();
    }
}
