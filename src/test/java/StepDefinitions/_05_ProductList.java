package StepDefinitions;

import Pages.MainMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _05_ProductList {
    MainMenu mm = new MainMenu();
    @Then("Check the how many products this side")
    public void checkTheHowManyProductsThisSide() {

        Assert.assertTrue(mm.getWebElement("headcounter").getText().contains("5"));

    }

    @And("Check the how many products this product count")
    public void checkTheHowManyProductsThisProductCount() {
        Assert.assertTrue(mm.getWebElement("productcount").getText().contains("5"));
    }

    @Then("Verify that the count matches the numbers in step two and step three")
    public void verifyThatTheCountMatchesTheNumbersInStepTwoAndStepThree() {
        Assert.assertTrue(mm.productContainer.size() == 5);
    }
}
