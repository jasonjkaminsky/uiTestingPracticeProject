package Test;

import Pages.ControlsPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class ControlsPageTest extends CommonMethods {

    @Test
    public void controlsPageTest(){
        ControlsPage controlsPage = new ControlsPage();
        dragAndDrop(controlsPage.dragBox, controlsPage.dropBox);
        doubleClick(controlsPage.dblClickBtn);
        controlsPage.acceptSimpleAlert();

        switchToIframe(controlsPage.iFrameA);
        sendText(controlsPage.iframeNameBox, "I am entering text in an iFrame!!!");
        System.out.println("You have successfully switched to the iFrame and entered text!");

    }
    // *** FINISHED *** //
}
