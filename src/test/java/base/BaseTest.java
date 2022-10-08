package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializeDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfigReader.readProperty("url"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    public void initializeDriver(String browser){
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/kuba/Projects/TLA/General/libs/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser name");
        }
    }

}
