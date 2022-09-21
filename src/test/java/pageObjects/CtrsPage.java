package pageObjects;

import HomePageAndTestDriver.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CtrsPage extends BasePage {

    public CtrsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement get2kBtn() {
        return findElementByXpath("//span[@class='cat-icon cat-icon-circle cat-icon-37 cat-cmt-icon-37']");
    }

    public WebElement getInputText2() {
        return findElementByXpath("//input[@name='q']");
    }


        public List<WebElement> getSmartphone() {
        return findElementsByXpath("//a[@class='df aic jcsb']");
    }
    public WebElement getIphone() {
        return findElementByXpath("//div[@class=\"submenu-0-2-56 df f1\"]/ul[1]/li[2]/a");
    }
    public List<WebElement> checkPicture() {
        return findElementsByXpath("//div[@class='br10 p8 border-box pr productCardCategory-0-2-283']");
    }
    public List<WebElement> checkCash1(){
        return findElementsByXpath("//div[@class='df aife']");
    }
    public List<WebElement> getNameBtn() {
        return findElementsByXpath("//a[@class='link line-clamp-2 break-word link-0-2-286']");
    }
    public WebElement getBuyBtn() {
        return findElementByXpath("//div[@class='catalog-facet']/div[1]");
    }
    public WebElement getBuyBtn1() {
        return findElementByXpath("//div[@class='mt32']//button[1]");
    }
    public WebElement getBasket() {
        return findElementByXpath("//div[@class='navigation-0-2-361']//button[1]");
    }

}

