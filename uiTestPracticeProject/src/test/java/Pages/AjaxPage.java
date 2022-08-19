package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class AjaxPage extends CommonMethods {

    @FindBy (xpath = "//a[contains(text(), 'AjaxCall')]")
    public WebElement ajaxLink;

    @FindBy (xpath = "//a[contains(text(), 'link')]")
    public WebElement ajaxBtn;

    @FindBy (id = "Result")
    public WebElement ajaxResult;

    public AjaxPage(){
        PageFactory.initElements(driver,this);
    }

}
