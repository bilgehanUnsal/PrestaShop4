package StepDefinitions;

import Pages.MainMenu;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _08_SendingMail {
    MainMenu mm = new MainMenu();
    @Then("Select class subject heading")
    public void selectClassSubjectHeading() {
        Select select = new Select(mm.getWebElement("subjectheading"));
        select.selectByVisibleText("Customer service");

        Select select1 = new Select(mm.getWebElement("orderreference"));
        select1.selectByIndex(1);

        Select select2 = new Select(mm.getWebElement("selectproduct"));
        select2.selectByIndex(1);
    }

    @Then("Upload file robot class")
    public void uploadFileRobotClass() throws AWTException, InterruptedException {
        Robot robot = new Robot();

        StringSelection dosyaYolu = new StringSelection("\"C:\\Users\\USER\\Pictures\\Screenshots\\MyFile.png\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        Thread.sleep(2);
        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        Thread.sleep(2);
        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }

        Thread.sleep(2);
        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        Thread.sleep(2);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);

        Thread.sleep(2);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
