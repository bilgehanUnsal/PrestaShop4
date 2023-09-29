package StepDefinitions;

import Pages.MainMenu;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _06_CheckAddtoCart {
    MainMenu mm = new MainMenu();
    @Then("Add to cart few Dresses")
    public void addToCartFewDresses(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = mm.getWebElement(strlinkList.get(i));
            mm.myClick(linkWebElement);
            mm.myClick(mm.getWebElement("addtocart"));
            GWD.getDriver().navigate().back();
        }

    }

    @Then("Check the quantity of products")
    public void checkTheQuantityOfProducts() {
        mm.verifyContainsText(mm.getWebElement("productsquantity"), "3");
    }
}
