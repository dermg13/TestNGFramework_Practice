package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTest extends BaseTest {
    private InputsPage page;

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver(){
        driver.findElement(By.xpath("//nav/a[text()='Inputs']")).click();
        page = new InputsPage((driver));
    }

    @Test (testName = "Verify Title of Page", description = "Title of page should be Inputs")
    public void test01 (){

        //failed on purpose to see screenshot
        Assert.assertEquals(driver.getTitle(), "TLA");
    }

    @Test (testName = "Verify message is displayed", description = "message input should be shown")
    public void test02 (){
        //enter "hello"
        page.messageField.sendKeys("hello");
        //click on show message button
        page.showMessageBtn.click();
        //verify message is displayed
        Assert.assertEquals(page.displayedMessage.getText(), "hello");

    }
}
