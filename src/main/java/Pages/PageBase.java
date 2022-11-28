package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class PageBase  {

    public JavascriptExecutor jSExecutor;
WebDriver driver;
    protected static void ClickBtn(WebElement Button)
    {
        Button.click();
    }

    protected static void SetTextElementTxt(WebElement TextElement, String Value)
    {
        TextElement.sendKeys(Value);
    }

    public void ScrollDown()
    {
        jSExecutor.executeScript("scrollBy(0,1000)");
    }


    public void ScrollUp()
    {
        jSExecutor.executeScript("scrollBy(1000,0)");
    }

    public static void ActionBuilder(WebElement Button,WebDriver driver )
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(Button);
		//actions.click(Button);
		Action action = actions.build();
		action.perform();
	}

    public static void ActionBuilderClicker(WebElement Button,WebDriver driver )
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(Button);
        actions.click(Button);
        Action action = actions.build();
        action.perform();
    }
    public boolean isElementPresent(By by) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

}
