package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


// https://live.mersys.io/ (Çalışacağımız site)
    //------------------------//

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix'][1]/input")
    private WebElement usernameInput;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendkeysUsernameInput(String username) {
        sendKeysToElement(usernameInput, username);
    }


    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordInput;

    public void sendkeysPasswordInput(String password) {
        sendKeysToElement(passwordInput, password);
    }


    // Dil bağımsız locator - hem Türkçe ("GİRİŞ YAP") hem İngilizce ("LOGIN") için çalışır
    @FindBy(xpath = "//button/span[contains(text(),'LOGIN') or contains(text(),'GİRİŞ YAP')]")
    private WebElement loginButton;

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    @FindBy(xpath = "//label[@class='mdc-label']")
    private WebElement rememberMeButton;

    public void clickRememberMeButton() {
        clickElement(rememberMeButton);
    }

    @FindBy(css = "[class='forgot-password'] ")
    private WebElement forgotPasswordButton;

    public void forgotPasswordButton() {
        clickElement(forgotPasswordButton);
    }

    @FindBy(xpath = "//div[@class='hot-toast-bar-base']")
    private WebElement invalidLoginText;  // yanlış username girildiğinde çıkan text

    public void verifyInvalidLogin() {
        verifyDisplayed(invalidLoginText, "invalid login text is not displayed.");

    }


    @FindBy(xpath = "//div[@class='logo']")
    private WebElement logo;      // giriş kısmında kaldığımızı belirtmek için campüs logosunun locatoru

    public void verifyLogo(){
        verifyDisplayed(logo,"Logo is not displayed");
    }



}