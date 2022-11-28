package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;


public class Options extends PageBase{
    WebDriver driver;

    public  Options (WebDriver driver) {
        this.driver = driver;
        jSExecutor =(JavascriptExecutor)driver;
    }
    Extractor ext;
    WebDriverWait wait;
    public void SelectFirstOption() throws Exception {
        ext=new Extractor();
        String FirstElementString=ext.Locaters(0,3);
        WebElement FirstElementElement=this.driver.findElement(By.xpath(FirstElementString));
        ClickBtn(FirstElementElement);

    }



    public void selectRandomProduct(){

        // Find and click on a random product
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
    }



}



