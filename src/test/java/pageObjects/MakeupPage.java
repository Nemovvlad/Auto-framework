package pageObjects;

import HomePageAndTestDriver.BasePage;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class MakeupPage extends BasePage {

    public MakeupPage(WebDriver driver) {
        super(driver);
    }
    public static void mouseMoved (int type){
        Point p = MouseInfo.getPointerInfo().getLocation();
        int width = (int) p.getX() + 300;
        int heigh = (int) p.getY() + 30;
        if(type == 0) {
            width = 10;
            heigh = 15;
        }
        Robot robot;
        try {
            robot = new Robot();
            robot.mouseMove(width,heigh);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

//    public WebElement getProduct() {
//        driver.findElement(By.xpath("//li[@class='menu-list__item full mobile-only']//a")).click();
//div[@class="header-top"]//div[@data-popup-handler="auth"]


//    public WebElement findElementByXpath(String xpath) {
//        return driver.findElement(By.xpath(xpath));



