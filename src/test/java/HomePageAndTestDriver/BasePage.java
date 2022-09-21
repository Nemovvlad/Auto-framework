package HomePageAndTestDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
//    public WebElement getSearchField() {
//        return driver.findElement(By.xpath("//input[@name='q']"));
//    }

    public WebElement findElementByXpath(String xpath) {
        return getClickableElement(xpath);
    }

    public WebElement getClickableElement(String locator) {
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(15));
        return waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
    public List<WebElement> findElementsByXpath(String xpath) {
        return getClickableElements(xpath);
    }
    public List<WebElement> getClickableElements(String locator) {
        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(15));
        return waitClick.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }
    public static void moveToElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).pause(2).perform();
    }
    public static void moveToElements(WebDriver driver, List<WebElement> element) {
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) element).pause(2).perform();
    }



}
