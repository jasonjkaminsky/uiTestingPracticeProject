package Test;

import Pages.SelectPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class SelectPageTest extends CommonMethods {

    @Test
    public void selectPageTest() throws InterruptedException {
    SelectPage selectPage = new SelectPage();
    selectPage.selectLink.click();
    selectPage.selectValue(selectPage.countriesSingleDD, "india");
    System.out.println("The India option was selected in single dropdown");

    selectVisibleText(selectPage.countriesMultDD, "China");
    selectVisibleText(selectPage.countriesMultDD, "England");

    Thread.sleep(2000);
    System.out.println("China and England were both chosen in the multi-select dropdown");

    }
    // *** FINISHED *** //
}
