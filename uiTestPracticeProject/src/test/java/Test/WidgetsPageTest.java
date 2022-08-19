package Test;

import Pages.WidgetsPage;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class WidgetsPageTest extends CommonMethods {

    @Test
    public void widgetsPageTest() {

        WidgetsPage widgetsPage = new WidgetsPage();
        widgetsPage.widgetsLink.click();

        widgetsPage.chooseFileButton.sendKeys("/Users/jasonkaminsky/Downloads/antisana.jpeg");
        widgetsPage.uploadButton.click();

        String upLoadMsgText = widgetsPage.uploadMessage.getText();

        if (upLoadMsgText.contains("Successfully")) {
            System.out.println("The image successfully uploaded!");
        }

    }
    // *** FINISHED *** //
}
