package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class AttendancePage extends BasePage {

    @FindBy(xpath = "//div[@aria-controls='mat-tab-group-0-content-2']")
    private WebElement excusesBtn;

    @FindBy(xpath = "//ms-add-button")
    private WebElement excusePlus;

    @FindBy(xpath = "//div[@class='mat-mdc-text-field-wrapper mdc-text-field mdc-text-field--outlined mdc-text-field--focused']")
    private WebElement typeExcuse;

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-icon-suffix ng-star-inserted']")
    private WebElement dateRangeBtn;

    @FindBy(xpath = "//input[@placeholder='Başlangıç Tarihi']")
    private WebElement startDate;

    @FindBy(xpath = "//input[@placeholder='Bitiş Tarihi']")
    private WebElement finishDate;

    @FindBy(xpath = "//textarea")
    private WebElement messageBox;

    @FindBy(xpath = "//span[text()='Dosyaları Ekle...']")
    private WebElement uploadDoc;

    @FindBy(xpath = "//*[contains(text(),' Yerel Bilgisayardan ')]")
    private WebElement localPC;

    @FindBy(xpath = "//ms-button[@caption='GENERAL.BUTTON.SEND']")
    private WebElement sendBtn;

    public AttendancePage(WebDriver driver) {
        super(driver);
    }

    public void clickExcusesBtn() {
        clickElement(excusesBtn);

    }

    public void clickExcusePlus() {
        clickElement(excusePlus);
    }

    public void selectTypeExcuse() {
        wait.until(ExpectedConditions.elementToBeClickable(typeExcuse));
        clickElement(typeExcuse);
        wait.until(ExpectedConditions.elementToBeClickable(dateRangeBtn));
        clickElement(dateRangeBtn);
    }

    public void clickStartEndDate() {
        clickElement(startDate);
        sendKeysToElement(startDate, "10.01.2026");
        sendKeysToElement(finishDate, "13.01.2026");
    }

    public void sendMessage() {
        sendKeysToElement(messageBox, "Hastaligim sebebi ile derse katilamayacagim.Rapor Ektedir");
    }

    public void uploadFile() throws AWTException {
        clickElement(uploadDoc);
        clickElement(localPC);

        String filePath = "C:\\Users\\Ахмед\\Desktop\\SAGLIK RAPORU.txt";


        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);


        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void clickSendBtn() {
        clickElement(sendBtn);
    }
}
