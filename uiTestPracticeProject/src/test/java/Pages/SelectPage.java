package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SelectPage extends CommonMethods {

    @FindBy (xpath = "//a[contains(text(), 'Select')]")
    public WebElement selectLink;

    @FindBy (id = "countriesSingle")
    public WebElement countriesSingleDD;

    @FindBy (id = "countriesMultiple")
    public WebElement countriesMultDD;

    @FindBy (id = "dropdownMenu1")
    public WebElement dropdownMenu;

    public SelectPage(){
        PageFactory.initElements(driver,this);
    }

}
