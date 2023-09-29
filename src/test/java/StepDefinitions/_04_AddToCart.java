package StepDefinitions;

import Pages.MainMenu;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_AddToCart {
    MainMenu mm = new MainMenu();
    @When("Hover over and click summer dresses")
    public void hoverOverAndClickSummerDresses() {
        mm.actions.moveToElement(mm.getWebElement("women")).build().perform();

        mm.myClick(mm.getWebElement("summerdresses"));
    }

    @And("Product should be successfully added to cart")
    public void productShouldBeSuccessfullyAddedToCart() {
        mm.verifyContainsText(mm.getWebElement("confirmtext"), "successfully");
    }

    @Then("Hover over and click few summer dresses")
    public void hoverOverAndClickFewSummerDresses() {
        mm.actions.moveToElement(mm.getWebElement("randomProductSummerDress")).build().perform();

        mm.myJSClick(mm.getWebElement("randomproduct"));
    }
}
