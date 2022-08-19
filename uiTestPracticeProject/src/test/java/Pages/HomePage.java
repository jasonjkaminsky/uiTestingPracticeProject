package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class HomePage extends CommonMethods {

    @FindBy (xpath = "//a[contains(text(), 'Home')]")
    public WebElement homeLink;

    @FindBy (xpath = "//table[@class = 'table']/tbody/tr")
    public List<WebElement> tableRows;

    @FindBy (xpath = "//a[@rel = 'next']")
    public WebElement nextBtn;

    @FindBy (xpath = "(//button[text() = 'DELETE'])[5]")
    public WebElement deleteBtn;

    @FindBy (xpath = "//input[@value = 'Delete']")
    public WebElement confirmDeleteBtn;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

}
