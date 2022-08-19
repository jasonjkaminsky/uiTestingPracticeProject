package Test;

import Pages.FormPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class FormPageTest extends CommonMethods {

    @Test
    public void formPageTest() throws InterruptedException {
        FormPage formPage = new FormPage();
        formPage.formLink.click();
        formPage.firstNameField.sendKeys("Jason");
        formPage.lastNameField.sendKeys("Kaminsky");
        formPage.maritalStatusRadioButton.click();
        formPage.readHobbyButton.click();
        Select select = new Select(formPage.countriesDD);
        select.selectByVisibleText("Ecuador");

        formPage.dateOfBirthField.sendKeys("04/19/1983");
        formPage.phoneNumberField.sendKeys("5558675309");
        formPage.usernameField.sendKeys("PatiChai99");

        formPage.emailField.sendKeys("fakeemailaddress@yahoo.com");
        formPage.aboutYourselfField.sendKeys("I love QA !!!");
        formPage.passwordField.sendKeys("cmdskofneok@5QA");
        Thread.sleep(3000);
        formPage.submitButton.click();

    }
    // *** FINISHED *** //
}
