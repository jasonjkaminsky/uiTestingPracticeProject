package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ControlsPage extends CommonMethods {

    @FindBy (id = "draggable")
    public WebElement dragBox;

    @FindBy (id = "droppable")
    public WebElement dropBox;

    @FindBy (xpath = "//button[@name = 'dblClick']")
    public WebElement dblClickBtn;

    @FindBy (xpath = "//iframe[@name= 'iframe_a']")
    public WebElement iFrameA;

    @FindBy (xpath = "//label[contains(text(), 'Enter')]/following-sibling::input")
    public WebElement iframeNameBox;

    public ControlsPage(){
        PageFactory.initElements(driver, this);
    }

}
