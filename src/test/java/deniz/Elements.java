package deniz;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements()  {
            PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]")
    public WebElement dress;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[1]/div/div[1]/div/a[1]/img")
    public WebElement urun1;
    @FindBy(css = "#add_to_cart > button > span")
    public WebElement addCard;
    @FindBy(css = "div.button-container > span > span")
    public WebElement devam;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[2]/div/div[1]/div/a[1]/img")
    public WebElement urun2;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[3]/div/div[1]/div/a[1]/img")
    public WebElement urun3;
    @FindBy(css = "#summary_products_quantity")
    public WebElement urunDogrulama;
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement sepet;

    @FindBy(css = "#contact-link > a")
    public WebElement contact;
    @FindBy(css = "#id_contact")
    public WebElement subject;
    @FindBy(css = "#email")
    public WebElement mail;
    @FindBy(css = "#id_order")
    public WebElement order;
    @FindBy(css = "#message")
    public WebElement msg;
    @FindBy(css = "#fileUpload")
    public  WebElement upload;
    @FindBy(css = "#submitMessage > span > i")
    public WebElement gonder;




}

