package Test;

import Pages.HomePage;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class HomePageTest extends CommonMethods {

    @Test
    public void homePageTest() throws InterruptedException {

        HomePage homePage = new HomePage();
        homePage.homeLink.click();

        boolean personNotFound = true;

        while (personNotFound) {
            for (int i = 0; i < homePage.tableRows.size(); i++) {
                String rowText = homePage.tableRows.get(i).getText();
                if (rowText.contains("Lexter")) {
                    personNotFound = false;
                    Thread.sleep(2000);
                    homePage.deleteBtn.click();
                }
            }
            if (personNotFound) {
                homePage.nextBtn.click();
            }

        }

        homePage.confirmDeleteBtn.click();
        System.out.println("Lexter was successfully deleted!");

    }
    // *** FINISHED *** //
}
