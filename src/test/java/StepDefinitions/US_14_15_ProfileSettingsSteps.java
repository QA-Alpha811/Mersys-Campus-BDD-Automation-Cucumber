package StepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProfileSettingsPage;
import utility.BaseDriver;

import java.awt.*;

public class US_14_15_ProfileSettingsSteps {

    WebDriver driver;
    ProfileSettingsPage profileSettingsPage;
    HomePage homePage;

    public US_14_15_ProfileSettingsSteps() {
        this.driver = BaseDriver.getDriver(); // BaseDriver'dan driver al
        this.profileSettingsPage=new ProfileSettingsPage(driver);
        this.homePage=new HomePage(driver);
    }

    @Then("click the profile settings button")
    public void click_the_profile_settings_button() {
       homePage.clickProfileButton();
    }
    @Then("click the settings button")
    public void click_the_settings_button() {
       profileSettingsPage.clickSettingsBtn();
    }
    @Then("click avatar to upload profile picture")
    public void click_avatar_to_upload_profile_picture() {
       profileSettingsPage.clickAvatar();
    }
    @Then("click the box for upload profile picture")
    public void click_the_box_for_upload_profile_picture() {
        profileSettingsPage.clickBox();
    }
    @Then("select picture from local PC and click open button")
    public void select_picture_from_local_pc_and_click_open_button() throws AWTException {
        profileSettingsPage.selectProfilePicture();
    }
    @Then("click the upload button")
    public void click_the_upload_button() {
        profileSettingsPage.clickUploadBtn();
    }
    @Then("click the save button")
    public void click_the_save_button() throws AWTException {
        profileSettingsPage.saveChanges();
    }
    @Then("verify that all changes with success message")
    public void verify_that_all_changes_with_success_message() {
        profileSettingsPage.verifyChanges();
    }
    @Then("click the settings button again and change the theme for UI")
    public void clickTheSettingsButtonAgainAndChangeTheThemeForUI() throws AWTException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        profileSettingsPage.javaScClick();
        profileSettingsPage.clickSettingsBtn();
        profileSettingsPage.selectTheme();
    }
}
