package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class ActionsPage extends CommonMethods {

    @FindBy (xpath = "//a[text()='Actions']")
    public WebElement actionsLink;

    @FindBy (xpath = "//button[@name = 'click']")
    public WebElement clickMeButton;

    @FindBy (xpath = "//button[@name = 'dblClick']")
    public WebElement dblClickButton;

    @FindBy (id = "draggable")
    public WebElement draggable;

    @FindBy (id = "droppable")
    public WebElement droppable;

    public ActionsPage(){
        PageFactory.initElements(driver,this);
    }


}
