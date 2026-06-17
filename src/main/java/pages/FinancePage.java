package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class FinancePage extends BasePage{
    public FinancePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@mat-menu-item][2]")
    private WebElement financeBtn;

    @FindBy(xpath = "//*[contains(text(),'My Finance')]")
    private WebElement myFinanceBtn;


    @FindBy(xpath = "//*[@class='mat-sort-header-content' and contains(text(),'Student')]")
    private WebElement studentText;

    @FindBy(xpath = "//*[@id='ms-table-0']/div/table/tbody/tr/td[2]/student-image/div/div[2]/div[1]/span")
    private WebElement student;

    @FindBy(xpath = "//*[@id='ms-table-0']/div/table/tfoot/tr[2]/td/div/div/button")
    private WebElement threeDots;

    @FindBy(xpath = "//*[contains(text(),'Excel')]")
    private WebElement excellReport;

     @FindBy(xpath = "//*[contains(text(),'Pdf')]")
    private WebElement pdfReport;

     @FindBy(xpath = "//*[@id='balance']")
     private WebElement feeBalanceDetail;

     @FindBy(xpath = "//*[@id='ms-table-4']")
     private WebElement installmentTable;

    @FindBy (xpath = "//div[@class='mat-sort-header-content' and contains (text() , 'Date')]")
     private WebElement dateInstallmentTable;


     public void clickFinance(){
         clickElement(financeBtn);
     }
     public void clickMyFinance(){
         clickElement(myFinanceBtn);
     }

     public void verifyFinancePage(){
         verifyDisplayed(studentText, "Student" );
     }

   public void clickStudent(){
         clickElement(student);
   }


    public void clickFeeBalanceDetailBtn(){
     clickElement(feeBalanceDetail);
     }
     public void verifyInsatllmentTableisVisible(){
         verifyDisplayed(dateInstallmentTable, "Date");
     }


     public void clickThreedots(){
         clickElement(threeDots);
     }
     public void clickExcellRepost(){
         clickElement(excellReport);
     }
     public void verifyExcellReportWasDownloaded(String fileName){
         String downloadPath = "C:\\Users\\asus\\Downloads";
         File file = new File(downloadPath + "\\" + fileName);
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

         wait.until(driver -> file.exists() && file.length() > 0);
         Assert.assertTrue(file.exists(), "Excel file was NOT downloaded!");
     }







}
