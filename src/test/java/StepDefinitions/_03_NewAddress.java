package StepDefinitions;

import Pages.MainMenu;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;

public class _03_NewAddress {
    MainMenu mm = new MainMenu();
    @And("Select state")
    public void selectState() {
        Select select = new Select(mm.getWebElement("state"));
        select.selectByVisibleText("California");
    }
}
