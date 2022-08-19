package Test;

import Pages.SwitchToPage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.Iterator;
import java.util.Set;

public class SwitchToPageTest extends CommonMethods {

    @Test
    public void switchToPageTest(){
        SwitchToPage switchToPage = new SwitchToPage();
        switchToPage.switchToLink.click();
        switchToPage.alertButton.click();
        switchToPage.acceptSimpleAlert();
        switchToPage.confirmAlertButton.click();
        Alert confirmAlert = driver.switchTo().alert();  // just for practice
        confirmAlert.dismiss(); // just for practice
        System.out.println("The Confirmation alert was dismissed (cancel)");
        switchToPage.confirmAlertButton.click();
        switchToPage.acceptSimpleAlert();
        System.out.println("Simple alert and Confirmation alert were both accepted");
        switchToPage.promptAlertButton.click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("JASON");
        promptAlert.accept();

        switchToPage.launchModalButton.click();
        switchToPage.closeModalButton.click();
        System.out.println("Modal window was closed ( modal is NOT an alert, so no switching )");

        switchToPage.switchToIframe(switchToPage.iframe);
        switchToPage.enterNameField.sendKeys("JAAAAAAASON");

        driver.switchTo().defaultContent();


        // Advanced window handling //

        String mainPageHandle = driver.getWindowHandle();

        switchToPage.opensNewWindow.click(); // open new window
        switchToPage.opensNewWindow.click(); // open new window

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("There are " + allWindowHandles.size() + " windows opened");

        Iterator<String> it = allWindowHandles.iterator();
        while(it.hasNext()) { // start iterating through the handles (tabs)
            String handle = it.next(); // get one handle (tab)
            if (!mainPageHandle.equals(handle)) { // set a condition where main page is not equal to the handle
                driver.switchTo().window(handle); // switch focus to that specific window handle
                driver.manage().window().maximize(); // maximize the window
                String title = driver.getTitle(); // get the title
                System.out.println(title);
            }
        }

        driver.switchTo().window(mainPageHandle);  // refocus to main tab

    }
    // *** FINISHED *** //
}
