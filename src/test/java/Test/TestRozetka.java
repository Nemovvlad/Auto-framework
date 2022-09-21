package Test;

import HomePageAndTestDriver.TestInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RozetkaPage;

import java.util.ArrayList;

public class TestRozetka extends TestInit {

    @Test
    public void checkTitle() {
        RozetkaPage rozetkaPage = new RozetkaPage(driver);
        String input = "Холодильники";

        openUrl("https://rozetka.com.ua/");
        rozetkaPage.get1kBtn().click();
        rozetkaPage.getInputText1().sendKeys(input + "\n ");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(rozetkaPage.getFridge().size(), 60);

//        ArrayList<Integer> priceList = new ArrayList<>();
//        for (WebElement element : rozetkaPage.checkCash()) {
//            String textPrice = element.getText();
//            String replaceText = textPrice.replaceAll(" ", "").replaceAll("₴", "");
//            Integer parseTexToInteger = Integer.parseInt(replaceText);
//            priceList.add(parseTexToInteger);
//        }
//        int min = priceList.get(0);
//        int max = priceList.get(0);
//
//        for (Integer priceElement : priceList) {
//            if (priceElement < min) min = priceElement;
//            if (priceElement > max) max = priceElement;
//        }
//        System.out.println("min" + min);
//        System.out.println("max" + max);
    }
}
