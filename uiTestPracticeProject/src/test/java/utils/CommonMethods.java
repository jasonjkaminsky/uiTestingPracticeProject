package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;
    public static Actions action;
    public static JavascriptExecutor executor;
    public static Alert simpleAlert;
    public static WebDriverWait wait;
    public static Select select;


    /**
     * This method opens the uitestpractice url homepage in a new Chrome browser
     */
    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        String url = "http://www.uitestpractice.com/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    /**
     * This method closes a browser
     */
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }


    /**
     * This method types text in an element
     *
     * @param element
     * @param text
     */
    public void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }


    /**
     * This method switches to and accepts a simple alert
     */
    public void acceptSimpleAlert() {
        simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
    }


    /**
     * This method drags a WebElement and drops it at another WebElement
     *
     * @param dragElement
     * @param dropElement
     */
    public void dragAndDrop(WebElement dragElement, WebElement dropElement) {
        action = new Actions(driver);
        action.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).perform();
    }


    /**
     * This method double-clicks on a given WebElement
     *
     * @param element
     */
    public void doubleClick(WebElement element) {
        action = new Actions(driver);
        action.doubleClick(element).perform();
    }


    /**
     * This method uses Select class to select a WebElement by value from a dropdown
     *
     * @param selectElement
     * @param value
     */
    public void selectValue(WebElement selectElement, String value) {
        try {
            select = new Select(selectElement);
            select.selectByValue(value);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method uses Select class to select a WebElement by visible text from a dropdown
     *
     * @param selectElement
     * @param visibleText
     */
    public void selectVisibleText(WebElement selectElement, String visibleText) {
        try {
            select = new Select(selectElement);
            select.selectByVisibleText(visibleText);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method switches to an iFrame given an iframe WebElement
     *
     * @param iframe
     */
    public void switchToIframe(WebElement iframe) {
        try {
            driver.switchTo().frame(iframe);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method performs an explicit wait until the current WebElement is visible
     *
     * @param element
     * @param seconds
     */
    public void explicitWaitVisibility(WebElement element, int seconds) {
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
