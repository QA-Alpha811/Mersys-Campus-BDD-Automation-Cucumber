package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CalendarPage extends BasePage {
    public CalendarPage(WebDriver driver) {
        super(driver);
    }

    //Us-23-step1:navigate to the web page


    // Us-23-step2:Click on the Calendar menu and verify that the page is displayed.

    @FindBy(xpath = "//ms-layout-menu-button[@page='CALENDAR']")
    private WebElement calenderButton;

    public void clickCalendarButton() {
        clickElement(calenderButton);
    }

    @FindBy(xpath = "//span[contains(text(), ' Haftalık Ders Planı')]")
    private WebElement weeklyLessonPlanText;

    public void verifyCalenderPage() {
        verifyDisplayed(weeklyLessonPlanText, "Haftalık Ders Planı");
    }

    @FindBy(xpath = "//strong[@style='width: 100%;']")
    private WebElement weeklyDateRange;

    public void verifyWeeklyDateRange() {
        verifyDisplayed(weeklyDateRange, "The weekly date range for the lessons is not visible.");
    }


    //Us-23-step3:Review the courses listed on the calendar and check the course status icons.

    @FindBy(xpath = "//div[span[normalize-space()='P']]//span[normalize-space()='Yayınlandı']")
    private WebElement pYayinlandı;

    public void verifyPYayinlandi() {
        verifyDisplayed(pYayinlandı, "The lesson is not published.");
    }

    @FindBy(xpath = "//div[span[normalize-space()='S']]//span[normalize-space()='Başladı']")
    private WebElement sBasladi;

    public void verifySBasladi() {
        verifyDisplayed(sBasladi, "The lesson is not started.");
    }

    @FindBy(xpath = "//div[span[normalize-space()='E']]//span[normalize-space()='Bitti']")
    private WebElement eBitti;

    public void verifyEBitti() {
        verifyDisplayed(eBitti, "The lesson is not ended.");
    }

    @FindBy(xpath = "//div[span[normalize-space()='C']]//span[normalize-space()='İptal Edildi']")
    private WebElement cİptalEdildi;


    public void verifyCİptalEdildi() {
        verifyDisplayed(cİptalEdildi, "The class is cancelled.");
    }


    //Us-23-step4:On the Calendar page, you can see the weekly course plan and calendar page links, and click on these links.

    @FindBy(xpath = "//span[@class='mdc-tab__text-label' and normalize-space()='Takvim']")
    private WebElement calenderBtn;

    public void clickCalenderBtn() {
        clickElement(calenderBtn);
    }
    @FindBy(xpath = "//span[@class='mdc-tab__text-label' and normalize-space()='Akademik Takvim']")
    private WebElement academicCalenderBtn;

    public void clickAcademicCalenderBtn() {
        clickElement(academicCalenderBtn);
    }
    @FindBy(xpath = "//span[contains(text(), ' Haftalık Ders Planı')]")
    private WebElement weeklyLessonPlanBtn;

    public void clickWeeklyLessonPlanBtn() {
        clickElement(weeklyLessonPlanBtn);
    }


    //Us-23-step5:Visibility and clickability of the Previous, Today, and Next icons.

    @FindBy(xpath = "//div[@fxlayout='row']/button[2]/fa-icon[@class='ng-fa-icon']")
    private WebElement todayBtn;

    public void verifyTodayİcon() {
        verifyDisplayed(todayBtn, "The Today Icon is not displayed.");
    }
    public void clickTodayBtn() {
        clickElement(todayBtn);
    }


    @FindBy(xpath = "//div[@fxlayout='row']/button[1]/fa-icon[@class='ng-fa-icon']")
    private WebElement previousBtn;

    public void verifyPreviousİcon() {
        verifyDisplayed(previousBtn, "The Previous Icon is not displayed.");
    }

    public void clickPreviousBtn() {
        clickElement(previousBtn);
    }


    @FindBy(xpath = "//div[@fxlayout='row']/button[3]/fa-icon[@class='ng-fa-icon']")
    private WebElement nextBtn;

    public void verifyNextİcon() {
        verifyDisplayed(nextBtn, "The Next Icon is not displayed.");
    }

    public void clickNextBtn() {
        clickElement(nextBtn);
    }


    //Us-23-step6:The visibility and clickability of lessons on the weekly course schedule page.

    @FindBy(xpath = "//table[@data-vertable='ver1']")
    private WebElement weeklyCourseSchedule;

    public void verifyWeeklyCourseSchedule() {
        verifyDisplayed(weeklyCourseSchedule, "The weekly course schedule is not displayed.");
    }

    @FindBy(xpath = "//table[@data-vertable='ver1']//tbody//tr[2]/td[2]")
    private WebElement firstCourse;

    public void clickFirstCourse() {
        clickElement(firstCourse);
    }

    @FindBy(xpath = "//mat-panel-description[@style='padding-top: 4px; padding-right: 20px !important; display: flex; align-items: center;']/div")
    private WebElement authorizationWarningText;
    public  void verifyWarningText(){
        verifyDisplayed(authorizationWarningText,"Warning text is not displayed");
    }

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement warningTextCloseBtn;
    public  void closeWarningText(){
        clickElement(warningTextCloseBtn);
    }





    //Us-24-step1:Clickable access to a course on the Weekly Course Plan page and access to information about that course.

    @FindBy(xpath = "//mat-dialog-container[@tabindex='-1']")
    private WebElement CourseInfTable;

    public void verifyCourseInfTable() {
        verifyDisplayed(CourseInfTable,"Course Information Table is not displayed.");
    }

    //Us-24-step2:When a course that has not yet been published is clicked, a pop-up window may appear containing
    // information about the course (course name, teacher name, course date and time,
    // and the message "the meeting has not yet started").

    @FindBy(xpath = "//span[@class='title dialog-title']")
    private WebElement courseName;

    public void verifyCourseNameOnTable(){
        verifyDisplayed(courseName,"Course Name is not displayed.");
    }

    @FindBy(xpath = "//span[@style='font-weight: 500; color: black;']")
    private WebElement teacherName;

    public void verifyTeacherNameOnTable(){
        verifyDisplayed(teacherName,"Teacher Name is not displayed.");
    }

    @FindBy(xpath = "//ms-dialog-content[@class='mat-dialog-content ng-untouched ng-pristine ng-invalid']/div/div/div/div[3]/div[1]")
    private WebElement courseDate;

    public void verifyCourseDateOnTable(){
        verifyDisplayed(courseDate,"Course date is not displayed.");
    }

    @FindBy(xpath = "//ms-dialog-content[@class='mat-dialog-content ng-untouched ng-pristine ng-invalid']/div/div/div/div[3]/div[2]")
    private WebElement courseStartTime;

    public void verifyCourseStartTimeOnTable(){
        verifyDisplayed(courseStartTime,"Course Start Time is not displayed.");
    }

    @FindBy(xpath = "//ms-dialog-content/div/div[3]/fa-icon")
    private WebElement courseNotStartedSign;

    public void verifyCourseNotStartedSignOnTable(){
        verifyDisplayed(courseNotStartedSign,"Course Not Start Sign is not displayed.");
    }

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeInfoTableBtn;

    public  void closeInfoTable(){
        clickElement(closeInfoTableBtn);
    }




    //Us-24-step3:Click on a published (P), started (S), or finished (E) course and check
    // if the information screen can be opened and that the Information, Topic, Attachments,
    // and Recent Events links in the pop-up window are working correctly.

    public void clickPreviousBtnFourTimes() {
        for (int i = 0; i < 4; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(previousBtn));
            clickPreviousBtn();
        }
    }

    public void clickCourse(){
        clickElement(firstCourse);
    }

    public void verifyInfTable()
    {
        verifyDisplayed(CourseInfTable,"Course Information Table is not displayed.");
    }

    @FindBy(xpath = "//ms-tab-group/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")
    private WebElement informationBtn;
    public void verifyAndClickInformationBtn(){
        verifyDisplayed(informationBtn,"Information Link is not displayed.");
        clickElement(informationBtn);
    }

    @FindBy(xpath = "//ms-tab-group/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]")
    private WebElement topicBtn;
    public void verifyAndClickTopicBtn(){
        verifyDisplayed(topicBtn,"Topic Link is not displayed.");
        clickElement(topicBtn);
    }

    @FindBy(xpath = "//ms-tab-group/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]")
    private WebElement attachmentBtn;
    public void verifyAndClickAttachmentBtn(){
        verifyDisplayed(attachmentBtn,"Attachment Link is not displayed.");
        clickElement(attachmentBtn);
    }

    @FindBy(xpath = "//ms-tab-group/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]")
    private WebElement recentEventBtn;
    public void verifyAndClickRecentEventsBtn(){
        verifyDisplayed(recentEventBtn,"Recent Events link is not displayed.");
        clickElement(recentEventBtn);
    }


    //Us-25-step1:When a completed lesson (E) is clicked, a link to access
    // the lesson video should open and be clickable.

    @FindBy(xpath = "//ms-button[@caption='MEETINGS.TITLE.RECORDING']")
    private WebElement saveBtn;

    public  void verifySaveBtn(){
        verifyDisplayed(saveBtn,"Save Link is not displayed.");
    }


    //Us-25-step2:Checking the clickability of the save button and access to the lesson video.

    public void clickSaveBtn(){
        clickElement(saveBtn);
    }

    @FindBy(xpath = "//div[@class='cdk-overlay-container']")
    private WebElement videoPresentationLogo;

    public  void verifyVideoScreenOpen(){
        verifyDisplayed(videoPresentationLogo,"Video screen is not opened.");
    }

    public  void closepage(){
        driver.close();
    }
}
