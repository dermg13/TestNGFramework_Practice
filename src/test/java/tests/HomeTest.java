package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    private HomePage page;
    @Test
    public void test01(){
        String expected = "Automation with Selenium";
        String actual = driver.findElement(By.id("title")).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test02(){
        String expected = "Automation with Selenium";
        String actual = page.headerTitle.getText();
        Assert.assertEquals(expected, actual);
    }
    }

