package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToList extends PageBase {
    WebDriver driver;
    String NameInViewListPage;
    String NameInDetailsPage;
    String NameOfProductInDetails;
    String NameOfProductInCart;

    public AddToList(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    Extractor ext;
    WebDriverWait wait;
    String AddToCartLocator;

    public String getNameInViewListPage() {

        return NameInViewListPage;
    }

    public String getNameInDetailsPage() {
        return NameInDetailsPage;
    }

    public String getNameInProductDetailsPage() {

        return NameOfProductInDetails;
    }


    public void AddTheSelectedItemToList() throws Exception {
        ext = new Extractor();

        String AddToListString = ext.Locaters(0, 5);
        WebElement AddToListElement = this.driver.findElement(By.xpath(AddToListString));

        String AddToCartLocator = ext.Locaters(0, 29);
        try {
            WebElement AddToCartElement = this.driver.findElement(By.xpath(AddToCartLocator));


            if ((AddToCartElement).isDisplayed()) {
                String NameOfProductInDetailsLocator = ext.Locaters(0, 32);
                WebElement NameOfProductInDetailsElement = this.driver.findElement(By.xpath(NameOfProductInDetailsLocator));
                NameOfProductInDetails = NameOfProductInDetailsElement.getText();

                ClickBtn(AddToCartElement);
                String CartLocator = ext.Locaters(0, 30);
                WebElement CartLabelElement = this.driver.findElement(By.xpath(CartLocator));
                ClickBtn(CartLabelElement);


                String NameOfProductInCartLocator = ext.Locaters(0, 31);
                WebElement NameOfProductInCartElement = this.driver.findElement(By.xpath(NameOfProductInCartLocator));
                NameOfProductInCart = NameOfProductInCartElement.getText();
                System.out.println(NameOfProductInDetails);
                System.out.println(NameOfProductInCart);
                wait = new WebDriverWait(driver, 60);


            } else if ((AddToListElement.isDisplayed())) {


                ClickBtn(AddToListElement);

                String NameInProductString = ext.Locaters(0, 17);
                WebElement NameInProductElement = this.driver.findElement(By.xpath(NameInProductString));
                NameInDetailsPage = NameInProductElement.getText();
                String ViewListLocator = ext.Locaters(0, 15);
                WebElement VieListBtn = this.driver.findElement(By.xpath(ViewListLocator));
                ClickBtn(VieListBtn);
                String NameInViewListString = ext.Locaters(0, 16);
                WebElement NameInViewListElement = this.driver.findElement(By.xpath(NameInViewListString));
                NameInViewListPage = NameInViewListElement.getText();
                System.out.println(NameInViewListPage);
                System.out.println(NameInDetailsPage);

            }


        } catch (Exception e) {

        }

    }

}








