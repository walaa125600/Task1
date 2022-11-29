package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn extends PageBase {

    WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    Extractor ext;

    public void HoverToSignIn() throws Exception {
        ext = new Extractor();
        String HoverListLocator = ext.Locaters(0, 12);
        WebElement HoverListElement = this.driver.findElement(By.xpath(HoverListLocator));
        ActionBuilder(HoverListElement, this.driver);

    }

    public void Sign_In() throws Exception {
        ext = new Extractor();
        String SignInBtnLocator = ext.Locaters(0, 13);
        WebElement SignInBtnElement = this.driver.findElement(By.xpath(SignInBtnLocator));
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(SignInBtnElement));
        jSExecutor.executeScript("arguments[0].click();", SignInBtnElement);
    }

    public void SignInToAmazonAccount() throws Exception {
        ext = new Extractor();
        String EmailTxtBoxString = ext.Locaters(0, 7);
        WebElement EmailTxtBoxElement = this.driver.findElement(By.xpath(EmailTxtBoxString));
        String EmailTxtBoxValue = ext.Locaters(1, 1);
        SetTextElementTxt(EmailTxtBoxElement, EmailTxtBoxValue);
        String ContinueBtnString = ext.Locaters(0, 8);
        WebElement ContinueBtnElement = this.driver.findElement(By.xpath(ContinueBtnString));
        ClickBtn(ContinueBtnElement);

        String PasswordTxtBoxString = ext.Locaters(0, 9);
        WebElement PasswordTxtBoxElement = this.driver.findElement(By.xpath(PasswordTxtBoxString));
        String PasswordTxtBoxValue = ext.Locaters(1, 2);
        SetTextElementTxt(PasswordTxtBoxElement, PasswordTxtBoxValue);

        String SignInBtnLocator = ext.Locaters(0, 10);
        WebElement SignInBtn = this.driver.findElement(By.xpath(SignInBtnLocator));
        ClickBtn(SignInBtn);
    }
}
