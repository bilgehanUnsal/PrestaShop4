package StepDefinitions;

import Pages.MainMenu;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_UserRegistration {
    MainMenu mm = new MainMenu();
    @Given("Navigate to PrestaShop")
    public void navigateToPrestaShop() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @And("Enter the input box")
    public void enterTheInputBox(DataTable dt) {
        List< List<String> >   items=  dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e=mm.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            mm.mySendKeys(e, yazi);
        }
    }

    @And("Select birthday")
    public void selectBirthday() {
        Select select = new Select(mm.getWebElement("days"));
        select.selectByValue("6");

        Select select1 = new Select(mm.getWebElement("months"));
        select1.selectByValue("11");

        Select select2 = new Select(mm.getWebElement("years"));
        select2.selectByValue("2002");
    }

    @Then("Check the logIn")
    public void checkTheLogIn() {
        mm.verifyContainsText(mm.getWebElement("logout"), "out");
    }
}
