package Test;

import HomePageAndTestDriver.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AmazonCarPage;
import pageObjects.RozetkaPage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class TestAmazonCar extends TestInit {

    @Test
    public void checkCar() {
        AmazonCarPage amazonCarPage = new AmazonCarPage(driver);

//        openUrl("https://www.amazon.com");
//
//        try {
//            driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
//            System.out.println("bad");
//        } catch ( Exception e) {
//            System.out.println("file not find");
//        }



//
//        openUrl("https://www.amazon.com/s?k=car");
//
//
//        for (WebElement element : amazonCarPage.getCarkBtn()) {
//            Assert.assertTrue(element.getText().toLowerCase(Locale.ROOT).contains("car"));
//            element.getText().replace("car","cbr");
//        }
//        openUrl("https://www.amazon.com/ref=nav_logo");
//
//        Assert.assertEquals(amazonCarPage.getPicture().size(), 11);
    }
}
