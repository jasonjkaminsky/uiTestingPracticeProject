package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class FormPage extends CommonMethods {

    @FindBy (xpath = "//a[contains(text(), 'Form')]")
    public WebElement formLink;

    @FindBy (id = "firstname")
    public WebElement firstNameField;

    @FindBy (id = "lastname")
    public WebElement lastNameField;

    @FindBy (xpath = "//input[@type='radio'][following-sibling::text()[position()=1][contains(., 'Married')]]")
    public WebElement maritalStatusRadioButton;

    @FindBy (xpath = "//input[@value = 'read']")
    public WebElement readHobbyButton;

    @FindBy (xpath = "//select[@id='sel1']")
    public WebElement countriesDD;

    @FindBy (id = "datepicker")
    public WebElement dateOfBirthField;

    @FindBy (id = "phonenumber")
    public WebElement phoneNumberField;

    @FindBy (id = "username")
    public WebElement usernameField;

    @FindBy (id = "email")
    public WebElement emailField;

    @FindBy (id = "comment")
    public WebElement aboutYourselfField;

    @FindBy (id = "pwd")
    public WebElement passwordField;

    @FindBy (xpath = "//button[@type = 'submit']")
    public WebElement submitButton;

    public FormPage(){
        PageFactory.initElements(driver,this);
    }




}
