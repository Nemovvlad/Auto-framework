package pageObjects;

import HomePageAndTestDriver.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.reporters.jq.BasePanel;

import java.util.List;

public class AmazonCarPage extends BasePage {

    public AmazonCarPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getCarkBtn() {
        return findElementsByXpath("//div[@class=\"a-section a-spacing-none a-spacing-top-small s-title-instructions-style\"]/h2");
    }

    public List<WebElement> getPicture(){
        return findElementsByXpath("//div[@class='a-cardui fluid-fat-image-link fluid-card fluid-fat-image-link']");
    }


}
