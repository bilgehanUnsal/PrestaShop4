package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabMenu extends Parent {

    public TabMenu() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Women")
    private WebElement women;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "women": return this.women;
        }
        return null;
    }
}
