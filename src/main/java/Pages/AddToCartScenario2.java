package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class AddToCartScenario2 extends PageBase {
    WebDriver driver;
    WebDriverWait wait;

    public AddToCartScenario2(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    Extractor ext;

    public void SelectRandomItem() throws Exception {
        ext = new Extractor();
        wait = new WebDriverWait(driver, 100);
        // Find and click on a random product
        String RandomListLocator = ext.Locaters(0, 26);
        List<WebElement> allProducts = driver.findElements(By.xpath(RandomListLocator));
        wait = new WebDriverWait(driver, 100);
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        System.out.println(randomProduct);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allProducts.get(randomProduct));

        //  boolean staleElement = true;
       /* while(staleElement)
        {
            try
            {
                Thread.sleep(1000);
                allProducts.get(randomProduct).click();
                staleElement = false;
            }
            catch(StaleElementReferenceException e)
            {
                staleElement = true;
            }
        }*/
        allProducts.get(randomProduct).click();
        System.out.println(allProducts.get(randomProduct));
        // ClickBtn( allProducts.get(randomProduct));


    }


    public void AddToList() throws Exception {
        ext = new Extractor();
       /* String AddToListLocator= ext.Locaters(0,27);
        By AddToList = By.xpath(AddToListLocator);
        WebElement AddToListElement= this.driver.findElement(AddToList);*/

       // wait = new WebDriverWait(driver, 50);
        /*String AddToCartLocator= ext.Locaters(0,14);
        By AddToCart = By.className(AddToCartLocator);
        WebElement AddToCartElement= this.driver.findElement(AddToCart);*/

       // driver.navigate().refresh();
        //wait = new WebDriverWait(driver, 50);

        String AddToListLocator = ext.Locaters(0, 5);


        By AddToList = By.xpath(AddToListLocator);
        WebElement AddToListElement = this.driver.findElement(AddToList);
        String AddToCartLocator = ext.Locaters(0, 14);
    // wait = new WebDriverWait(driver, 50);

try {
    By AddToCart = By.xpath(AddToCartLocator);
    WebElement AddToCartElement = this.driver.findElement(AddToCart);
    if (AddToCartElement.isDisplayed()) {

        wait = new WebDriverWait(driver, 100);
        ClickBtn(AddToCartElement);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddToCartElement);
        //WebDriverWait wait = new WebDriverWait(driver, 50);
       // wait.until(ExpectedConditions.elementToBeClickable(AddToCartElement));
       // jSExecutor.executeScript("arguments[0].click();", AddToCartElement);

        System.out.println("7");

    }  else if (AddToListElement.isDisplayed()) {
        wait = new WebDriverWait(driver, 100);
        ClickBtn(AddToListElement);
        System.out.println("10");

    }


}
catch (Exception e){

}

        }
    }
