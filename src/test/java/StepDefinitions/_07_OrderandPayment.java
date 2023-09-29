package StepDefinitions;

import Pages.MainMenu;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _07_OrderandPayment {
    MainMenu mm = new MainMenu();
    @When("Click on the element in MainMenu")
    public void clickOnTheElementInMainMenu(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = mm.getWebElement(strlinkList.get(i));
            mm.myClick(linkWebElement);
        }
    }

    @Then("User add to cart few Dresses")
    public void userAddToCartFewDresses() {
        mm.myClick(mm.getWebElement("dress1"));
        mm.myClick(mm.getWebElement("addtocart"));
    }

    @Then("User select unsuccessfull payment method")
    public void userSelectUnsuccessfullPaymentMethod(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = mm.getWebElement(strlinkList.get(i));
            mm.myClick(linkWebElement);
            GWD.getDriver().navigate().back();
        }
    }

    @And("User select successfull payment method")
    public void userSelectSuccessfullPaymentMethod(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = mm.getWebElement(strlinkList.get(i));
            mm.myClick(linkWebElement);
        }
    }

    @Then("User check the info")
    public void userCheckTheInfo() {
        double amount = Double.parseDouble(mm.getWebElement("amount").getText().replaceAll("[^0-9.]", ""));
        mm.myClick(mm.getWebElement("proceed"));
        double amount2 = Double.parseDouble(mm.getWebElement("carttotal").getText().replaceAll("[^0-9.]", ""));

        Assert.assertTrue(amount == amount2);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        Assert.assertTrue(mm.getWebElement("ordersuccessmessage").getText().contains("complete"));
    }

    @And("Checkbox button")
    public void checkboxButton() {
        mm.getWebElement("checkbox").sendKeys(Keys.SPACE);
        mm.myClick(mm.getWebElement("proceed"));
    }
}
