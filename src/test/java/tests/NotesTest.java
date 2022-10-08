package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NotesPage;

public class NotesTest extends BaseTest {
    private NotesPage page;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        super.setUp();
        driver.findElement(By.xpath("//nav/a[text()='Notes']")).click();
        page = new NotesPage(driver);
    }

    @Test (testName = "Verify Title")
    public void test01() {
        Assert.assertEquals(driver.getTitle(), "TLA Automation");
    }

    @Test
    public void test02(){
        Assert.assertEquals(page.getText(page.headerNotesPage), "Multiple Windows");
    }
}
