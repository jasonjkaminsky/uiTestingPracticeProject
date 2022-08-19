package Test;

import Pages.AjaxPage;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class AjaxPageTest extends CommonMethods {

    @Test
    public void ajaxPageTest(){
        AjaxPage ajaxPage = new AjaxPage();
        ajaxPage.ajaxLink.click();
        ajaxPage.ajaxBtn.click();
        ajaxPage.explicitWaitVisibility(ajaxPage.ajaxResult, 20);
        if (ajaxPage.ajaxResult.isDisplayed()){
            System.out.println("The ajax text is displayed!");
        }

    }
    // *** FINISHED *** //
}
