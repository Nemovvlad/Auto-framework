package pageObjects;

import HomePageAndTestDriver.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RozetkaPage extends BasePage {

    public RozetkaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement get1kBtn() {
        return findElementByXpath("//span[@class='exponea-close-cross']");
    }

    public WebElement getInputText1() {
        return findElementByXpath("//input[@name='search']");
    }

    public List<WebElement> getFridge() {
        return findElementsByXpath("//div[@class='goods-tile__inner']");
    }

    public List<WebElement> checkCash() {
        return findElementsByXpath("//span[@class='goods-tile__price-value']");
    }

    //span[@class='goods-tile__price-value']
    //span[@class='exponea-close-cross']
    //a[@class='menu-categories__link' and contains(text(), 'Бытовая техника')]
}
