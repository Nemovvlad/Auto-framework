package Test;

import HomePageAndTestDriver.TestInit;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.CtrsPage;


public class Testctrs extends TestInit {
    @Test
    public void checkCtrsTitle() {
        Actions actions = new Actions(driver);
        CtrsPage ctrsPage1 = new CtrsPage(driver);

        openUrl("https://www.ctrs.com.ua/");

        actions.moveToElement(ctrsPage1.getSmartphone().get(2)).perform();
        actions.moveToElement(ctrsPage1.getIphone()).click().perform();
        actions.moveToElement(ctrsPage1.getBuyBtn()).click().perform();
        actions.moveToElement(ctrsPage1.getBuyBtn1()).click().perform();
        actions.moveToElement(ctrsPage1.getBasket()).click().perform();

//        Assert.assertEquals(ctrsPage1.checkPicture().size(), 15);
//
//        ArrayList<Integer> priceList = new ArrayList<>();
//        for (WebElement element : ctrsPage1.checkCash1()) {
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
//        System.out.println("min " + min);
//        System.out.println("max " + max);

    }
}
