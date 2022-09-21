package pageObjects;

import HomePageAndTestDriver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EducabaPage extends BasePage {

    public EducabaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getOkBtn() {
        return findElementByXpath("//div[@id='popmake-378149']//button");
    }

    public WebElement getInputText() {
        return findElementByXpath("//input[@name='s']");
    }

    public WebElement getCheckInputText() {
        return findElementByXpath("//div[@class='wrap']//h1");
    }


}
