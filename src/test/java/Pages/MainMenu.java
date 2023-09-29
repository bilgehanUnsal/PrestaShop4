package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class MainMenu extends Parent{

    public MainMenu() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy (xpath = "//a[@class='login']")
    private WebElement login;

    @FindBy (xpath = "//input[@id='email_create']")
    private WebElement inputMail;

    @FindBy (xpath = "//button[@id='SubmitCreate']")
    private WebElement createAnAccount;

    @FindBy (xpath = "//input[@id='id_gender1']")
    private WebElement gender;

    @FindBy (xpath = "//input[@id='customer_firstname']")
    private WebElement inputFirstName;

    @FindBy (xpath = "//input[@id='customer_lastname']")
    private WebElement inputLastName;

    @FindBy (xpath = "//input[@id='passwd']")
    private WebElement inputPassword;

    @FindBy (xpath = "//select[@id='days']")
    private WebElement days;

    @FindBy (xpath = "//select[@id='months']")
    private WebElement months;

    @FindBy (xpath = "//select[@id='years']")
    private WebElement years;

    @FindBy (xpath = "//button[@id='submitAccount']")
    private WebElement register;

    @FindBy (xpath = "//a[@title='Log me out']")
    private WebElement logOut;

    @FindBy (xpath = "//input[@id='email']")
    private WebElement mailLogIn;

    @FindBy (xpath = "//input[@id='passwd']")
    private WebElement passwordLogIn;

    @FindBy (xpath = "//button[@id='SubmitLogin']")
    private WebElement submitLogIn;

    @FindBy (xpath = "//a[@class='account']")
    private WebElement myAccount;

    @FindBy (xpath = "//a[@title='Add my first address']")
    private WebElement firstAddress;

    @FindBy (xpath = "//input[@id='address1']")
    private WebElement addressLine;

    @FindBy (xpath = "//input[@id='city']")
    private WebElement cityLine;

    @FindBy (xpath = "//input[@id='phone']")
    private WebElement homePhone;

    @FindBy (xpath = "//input[@id='phone_mobile']")
    private WebElement mobilePhone;

    @FindBy (xpath = "//input[@id='postcode']")
    private WebElement postCode;

    @FindBy (xpath = "//select[@id='id_state']")
    private WebElement state;

    @FindBy (xpath = "//button[@id='submitAddress']")
    private WebElement submit;

    @FindBy (xpath = "//a[@title='Women']")
    private WebElement women;

    @FindBy (xpath = "(//a[@title='Summer Dresses'])[1]")
    private WebElement summerDresses;

    @FindBy (xpath = "(//a[@title='Add to cart'])[2]")
    private WebElement randomProduct;

    @FindBy (xpath = "(//a[@class='product-name'])[2]")
    private WebElement randomProductSummerDress;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement confirmText;

    @FindBy (xpath = "(//a[@title='Dresses'])[2]")
    private WebElement dresses;

    @FindBy (xpath = "//span[@class='heading-counter']")
    private WebElement headCounter;

    @FindBy (xpath = "(//div[@class='product-count'])[1]")
    private WebElement productCount;

    @FindBy (xpath = "//div[@class='product-container']")
    public List<WebElement> productContainer;

    @FindBy (xpath = "(//a[@class='product-name'])[1]")
    private WebElement dress1;

    @FindBy (xpath = "//a[@title='View my shopping cart']")
    private WebElement cart;

    @FindBy (xpath = "//button[@name='Submit']")
    private WebElement addtocart;

    @FindBy (xpath = "(//a[@class='product-name'])[1]")
    private WebElement dress1image;

    @FindBy (xpath = "(//a[@class='product-name'])[2]")
    private WebElement dress2image;

    @FindBy (xpath = "(//a[@class='product-name'])[3]")
    private WebElement dress3image;

    @FindBy (css = "#summary_products_quantity")
    private WebElement productsQuantity;

    @FindBy (xpath = "//span[@title='Continue shopping']")
    private WebElement continueShopping;

    @FindBy (xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement checkOut;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    private WebElement proceed;

    @FindBy (xpath = "//input[@type='checkbox']")
    private WebElement checkBox;

    @FindBy (xpath = "//input[@id='paypal-standard-btn']")
    private WebElement payPal;

    @FindBy (xpath = "//div[@class='message'] / text()")
    private WebElement paypalMessage;

    @FindBy (xpath = "//a[@href='javascript:void(0);']")
    private WebElement creditCard;

    @FindBy (xpath = "//body / text()")
    private WebElement creditCardMessage;

    @FindBy (xpath = "//a[@title='Pay by bank wire']")
    private WebElement bankWire;

    @FindBy (xpath = "//span[@id='amount']")
    private WebElement amount;

    @FindBy (css = "[class='price']")
    private WebElement cartTotal;

    @FindBy (css = "[class='alert alert-success']")
    private WebElement orderSuccessMessage;

    @FindBy (xpath = "//a[@class='button-exclusive btn btn-default']")
    private WebElement orderHistory;

    @FindBy (xpath = "//a[@class='color-myaccount']")
    private WebElement orderRef;

    @FindBy(xpath = "(//*[@title='Contact us'])[1]")
    private WebElement contactUS;

    @FindBy(xpath = "//select[@id='id_contact']")
    private WebElement subjectHeading;

    @FindBy(xpath = "//select[@name='id_order']")
    private WebElement orderReference;

    @FindBy(xpath = "//select[@name='id_product']")
    private WebElement selectProduct;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement sendMessage;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement sendButton;

    @FindBy(id = "uniform-fileUpload")
    public WebElement chooseFile;

    public WebElement getWebElement(String element){
        switch (element){
            case "login" : return this.login;
            case "inputmail" : return this.inputMail;
            case "createanaccount" : return this.createAnAccount;
            case "gender" : return this.gender;
            case "inputfirstname" : return this.inputFirstName;
            case "inputlastname" : return this.inputLastName;
            case "inputpassword" : return this.inputPassword;
            case "days" : return this.days;
            case "months" : return this.months;
            case "years" : return this.years;
            case "register" : return this.register;
            case "logout" : return this.logOut;
            case "maillogin" : return this.mailLogIn;
            case "passwordlogin" : return this.passwordLogIn;
            case "submitlogin" : return this.submitLogIn;
            case "myaccount" : return this.myAccount;
            case "myfirstaddress" : return this.firstAddress;
            case "addressline" : return this.addressLine;
            case "cityline" : return this.cityLine;
            case "homephone" : return this.homePhone;
            case "mobilephone" : return this.mobilePhone;
            case "postcode" : return this.postCode;
            case "state" : return this.state;
            case "submit" : return this.submit;
            case "women" : return this.women;
            case "summerdresses" : return this.summerDresses;
            case "randomproduct" : return this.randomProduct;
            case "randomProductSummerDress" : return this.randomProductSummerDress;
            case "confirmtext" : return this.confirmText;
            case "dresses" : return this.dresses;
            case "headcounter" : return this.headCounter;
            case "productcount" : return this.productCount;
            case "cart" : return this.cart;
            case "addtocart" : return this.addtocart;
            case "dress1image" : return this.dress1image;
            case "dress2image" : return this.dress2image;
            case "dress3image" : return this.dress3image;
            case "checkout" : return this.checkOut;
            case "proceed" : return this.proceed;
            case "checkbox" : return this.checkBox;
            case "paypal" : return this.payPal;
            case "paypalmessage" : return this.paypalMessage;
            case "creditcard" : return this.creditCard;
            case "creditcardmessage" : return this.creditCardMessage;
            case "bankwire" : return this.bankWire;
            case "amount" : return this.amount;
            case "carttotal" : return this.cartTotal;
            case "ordersuccessmessage" : return this.orderSuccessMessage;
            case "orderhistory" : return this.orderHistory;
            case "continueshopping" : return this.continueShopping;
            case "productsquantity" : return this.productsQuantity;
            case "contactus" : return this.contactUS;
            case "subjectheading" : return this.subjectHeading;
            case "orderreference" : return this.orderReference;
            case "selectproduct" : return this.selectProduct;
            case "sendmessage" : return this.sendMessage;
            case "sendbutton" : return this.sendButton;
            case "dress1" : return this.dress1;
            case "choosefile" : return this.chooseFile;
        }
        return null;
    }
}
