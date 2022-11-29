package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends PageBase {
    WebDriver driver;
    WebElement NextBtnElement;
    WebDriverWait wait;
    Extractor ext;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    public void SearchForCars() throws Exception {
        ext = new Extractor();
        String SearchingString = ext.Locaters(0, 1);
        WebElement SearchBarElement = this.driver.findElement(By.xpath(SearchingString));
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(SearchBarElement));
        jSExecutor.executeScript("arguments[0].click();", SearchBarElement);
        SetTextElementTxt(SearchBarElement, "car accessories");
        SearchBarElement.sendKeys(Keys.ENTER);

    }

    public void OpenTodayDeals() throws Exception {
        ext = new Extractor();

        String TodayDealsString = ext.Locaters(0, 18);
        WebElement TodayDealsElement = this.driver.findElement(By.xpath(TodayDealsString));
        ClickBtn(TodayDealsElement);

        ScrollDown();

        String GroceryLocator = ext.Locaters(0, 20);
        WebElement GroceryElement = this.driver.findElement(By.xpath(GroceryLocator));
        ClickBtn(GroceryElement);

        String HeadPhonesLocator = ext.Locaters(0, 21);
        WebElement HeadPhonesElement = this.driver.findElement(By.xpath(HeadPhonesLocator));
        ClickBtn(HeadPhonesElement);
        wait = new WebDriverWait(driver, 50);
        ScrollDown();

        String OfferLinkLocator = ext.Locaters(0, 22);
        WebElement OfferLinkElement = this.driver.findElement(By.xpath(OfferLinkLocator));
        ClickBtn(OfferLinkElement);
        ScrollToNextElement();
    }

    public void ScrollToNextElement() throws Exception {
        ext = new Extractor();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Find element by link text and store in variable "Element"
        String NextBtnLocator = ext.Locaters(0, 24);
        NextBtnElement = this.driver.findElement(By.xpath(NextBtnLocator));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", NextBtnElement);
    }

    public void ReachToForthPage() throws Exception {
        ext = new Extractor();

        wait = new WebDriverWait(driver, 100);
        String ThirdPageLocator = ext.Locaters(0, 23);
        WebElement ThirdPageElement = this.driver.findElement(By.xpath(ThirdPageLocator));
        ClickBtn(ThirdPageElement);


        ScrollToNextElement();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String ForthPageLocator = ext.Locaters(0, 25);
        WebElement ForthPageElement = this.driver.findElement(By.xpath(ForthPageLocator));
        ClickBtn(ForthPageElement);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();

    }
}










