package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage extends BasePage {
    public NotesPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Multiple Windows']")
    public WebElement headerNotesPage;
}
