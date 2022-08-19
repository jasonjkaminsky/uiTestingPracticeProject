package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class SwitchToPage extends CommonMethods {

    @FindBy (xpath = "//a[contains(text(), 'Switch')]")
    public WebElement switchToLink;

    @FindBy(id = "alert")
    public WebElement alertButton;

    @FindBy (id = "confirm")
    public WebElement confirmAlertButton;

    @FindBy (id = "prompt")
    public WebElement promptAlertButton;

    @FindBy(xpath = "//button[contains(text(),'Launch modal')]")
    public WebElement launchModalButton;

    @FindBy (xpath = "//button[contains(text(), 'Close')]")
    public WebElement closeModalButton;

    @FindBy (xpath = "//iframe[@name = 'iframe_a']")
    public WebElement iframe;

    @FindBy (id = "name")
    public WebElement enterNameField;

    @FindBy (xpath = "  //a[contains(text(), 'Opens')]")
    public WebElement opensNewWindow;


    public SwitchToPage(){
        PageFactory.initElements(driver,this);
    }

}
