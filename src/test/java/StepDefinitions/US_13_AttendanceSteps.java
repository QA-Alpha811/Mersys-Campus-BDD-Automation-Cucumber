package StepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.AttendancePage;
import pages.HomePage;
import utility.BaseDriver;

import java.awt.*;

public class US_13_AttendanceSteps {

    WebDriver driver;
    AttendancePage attendancePage;
    HomePage homePage;

    public US_13_AttendanceSteps() {
        driver = BaseDriver.getDriver(); // BaseDriver'dan driver al
        this.attendancePage=new AttendancePage(driver);
        this.homePage=new HomePage(driver);
    }

    @Then("click the attendance button")
    public void click_the_attendance_button() {
        homePage.clickAttendanceButton();
    }

    @Then("click the attendance excuses")
    public void click_the_attendance_excuses() {
        attendancePage.clickExcusesBtn();
    }

    @Then("click the add excuse button")
    public void click_the_add_excuse_button() {
        attendancePage.clickExcusePlus();
    }

    @Then("select type of excuse")
    public void select_type_of_excuse() {
        attendancePage.selectTypeExcuse();
    }

    @Then("select date range")
    public void select_date_range() {
        attendancePage.clickStartEndDate();
    }

    @Then("write massage to teacher")
    public void writeMassageToTeacher() {
        attendancePage.sendMessage();
    }

    @Then("upload file")
    public void upload_file() throws AWTException {
        attendancePage.uploadFile();
    }

    @Then("click the send button")
    public void click_the_send_button() {
        attendancePage.clickSendBtn();
    }


}
