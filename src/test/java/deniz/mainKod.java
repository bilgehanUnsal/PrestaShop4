package deniz;

import Pages.Parent;
import Utilities.GWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class mainKod extends Parent{
    // Benim kodlarımda diğer görevler ile bağlantılı olduğu için bazı kısımlar eksik veya kendi random bilgilerime göre hazırlanmıştır
    // Bu kodların küçük düzenlemelere ihtiyacı bulunmaktadır
    @Test
    public void T6(){

        Elements el = new Elements();
        Parent p=new Parent();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://cleverppc.com/prestashop4/");
        el.dress.click();
        p.wait.until(ExpectedConditions.elementToBeClickable(el.urun1));
        el.urun1.click();

        p.wait.until(ExpectedConditions.elementToBeClickable(el.addCard));
        el.addCard.click();
        p.wait.until(ExpectedConditions.elementToBeClickable(el.devam));
        el.devam.click();
        driver.navigate().back();
        el.urun2.click();
        p.wait.until(ExpectedConditions.elementToBeClickable(el.addCard));
        el.addCard.click();
        p.wait.until(ExpectedConditions.elementToBeClickable(el.devam));
        el.devam.click();
        driver.navigate().back();
        el.urun3.click();
        p.wait.until(ExpectedConditions.elementToBeClickable(el.addCard));
        el.addCard.click();
        p.wait.until(ExpectedConditions.elementToBeClickable(el.sepet));
        el.sepet.click();
        p.wait.until(ExpectedConditions.textToBe(By.cssSelector("#summary_products_quantity"),"Your shopping cart contains: 3 products"));
        Assert.assertTrue(el.urunDogrulama.getText().contains("3"));

    }
    @Test
    public void Test8(){
        Elements el = new Elements();
        Parent p=new Parent();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://cleverppc.com/prestashop4/");
        el.contact.click();
        Select select=new Select(el.subject);
        select.selectByVisibleText("Customer service");
        el.mail.sendKeys("team14@mail.com");
        el.order.sendKeys("12345");
        el.upload.sendKeys("path/to/your/image.jpg");
        el.msg.sendKeys("\"Banka havalesi henüz yapıldı, ödeme dekontu ektedir. İsim Soyisim");
        p.wait.until(ExpectedConditions.textToBe(By.cssSelector("#email"),"\"Banka havalesi henüz yapıldı, ödeme dekontu ektedir. İsim Soyisim"));
        el.gonder.click();

    }
}
