package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ProfileSettingsPage extends BasePage {

    public ProfileSettingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//user-image")
    private WebElement profileSettings;

    @FindBy(xpath = "//span[text()='Ayarlar']")
    private WebElement settingsBtn;

    @FindBy(xpath = "//div/img[@class='profile-image avatar huge']")
    private WebElement profileAvatar;

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix']/mat-file-input")
    private WebElement avatarUploadBox;

    @FindBy(xpath = "//span[text()=' Yükle ']")
    private WebElement uploadBtn;

    @FindBy(xpath = "//span[text()='Kaydet']")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[text()='Profil güncellendi']")
    private  WebElement profileUpdatedMassage;

    @FindBy(xpath = "//span[text()='Varsayılan Tema']")
    private WebElement selectTheme1;

    @FindBy(xpath = "//mat-option[@value='purple-theme']")
    private WebElement purple;

    public void javaScClick(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", profileSettings);
    }
    public void clickSettingsBtn(){
        clickElement(settingsBtn);
    }
    public void clickAvatar(){
        clickElement(profileAvatar);
    }
    public void clickBox(){
        clickElement(avatarUploadBox);
    }
    public void selectProfilePicture() throws AWTException {
        String filePath = "C:\\Users\\Ахмед\\Desktop\\IAK1.jpg";


        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);


        Robot robot = new Robot();
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public void clickUploadBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(uploadBtn));
        clickElement(uploadBtn);
    }
    public void saveChanges() throws AWTException {
        clickElement(saveBtn);
    }
    public void verifyChanges(){
        verifyDisplayed(profileUpdatedMassage,"Success");
    }
    public void selectTheme() throws AWTException {
        Robot robot = new Robot();
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        clickElement(purple);
        clickElement(saveBtn);
    }

}
