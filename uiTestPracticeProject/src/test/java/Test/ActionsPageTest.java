package Test;

import Pages.ActionsPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import static utils.CommonMethods.driver;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class ActionsPageTest extends CommonMethods {

    @Test
    public void actionsPageTest() throws InterruptedException {
//  not needed bc the method has @BeforeMethod   openBrowser("http://www.uitestpractice.com/");
        ActionsPage actionsPage = new ActionsPage();
        actionsPage.actionsLink.click();
        actionsPage.clickMeButton.click();
        actionsPage.acceptSimpleAlert();
//        Actions action = new Actions(driver);
//        action.doubleClick(actionsPage.dblClickButton).perform();
        doubleClick(actionsPage.dblClickButton);
        actionsPage.acceptSimpleAlert();
        System.out.println("double click performed and accepted");
        dragAndDrop(actionsPage.draggable, actionsPage.droppable);
        System.out.println("Drag and drop was successful");
//      action.clickAndHold(actionsPage.draggable).moveToElement(actionsPage.droppable).release().build().perform();
//  not needed bc the method has @AfterMethod   actionsPage.closeBrowser();

    }
    // *** FINISHED *** //
}
