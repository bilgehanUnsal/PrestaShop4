package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    public JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
    public Actions actions = new Actions(GWD.getDriver());

    public void scrollToElement(WebElement element){
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        actions.moveToElement(element).build().perform();
        element.click();
    }

    public void mySendKeys(WebElement element, String yazi){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void verifyContainsText(WebElement element, String yazi){
        wait.until(ExpectedConditions.textToBePresentInElement(element, yazi));
        Assert.assertTrue(element.getText().toLowerCase().contains(yazi.toLowerCase()));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJSClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        js.executeScript("arguments[0].click();", element);
    }
}
