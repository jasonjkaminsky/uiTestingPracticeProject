package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class WidgetsPage extends CommonMethods {

    @FindBy (xpath = "//a[text() = 'Widgets']")
    public WebElement widgetsLink;

    @FindBy (id = "image_file")
    public WebElement chooseFileButton;

    @FindBy (xpath = "//input[@value = 'Upload']")
    public WebElement uploadButton;

    @FindBy (xpath = "//p[contains(text(), 'Successfully')]")
    public WebElement uploadMessage;

    public WidgetsPage(){
        PageFactory.initElements(driver,this);
    }

}
