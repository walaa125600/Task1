package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Options extends PageBase {
    WebDriver driver;

    public Options(WebDriver driver) {
        this.driver = driver;
        jSExecutor = (JavascriptExecutor) driver;
    }

    Extractor ext;

    public void SelectFirstOption() throws Exception {
        ext = new Extractor();
        String FirstElementString = ext.Locaters(0, 3);
        WebElement FirstElementElement = this.driver.findElement(By.xpath(FirstElementString));
        ClickBtn(FirstElementElement);

    }


}



