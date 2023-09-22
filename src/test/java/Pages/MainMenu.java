package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainMenu extends Parent{

    public MainMenu() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy (linkText = "Best Sellers")
    private WebElement bestSellers;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "bestSellers": return this.bestSellers;
        }
        return null;
    }
}
