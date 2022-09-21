//import org.openqa.selenium.WebElement;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MaxAndMin {
//    ArrayList<Double> goodsList = new ArrayList<>();
//    List<WebElement> webElementList = getListElements(xpath);
//
//        for (WebElement good : webElementList) {
//        String textPrice = good.getText();
//        String replaceText = textPrice.replaceAll("\\D", "");
//        Double parseTextInDooble = Double.parseDouble(replaceText);//DELETE Double
//        goodsList.add(parseTextInDooble);
//    }
//
//    Double minPrice = goodsList.get(0);
//    Double maxPrice = goodsList.get(0);
//
//        for (Double priceElement : goodsList) {
//        if (priceElement < minPrice) {
//            minPrice = priceElement;
//        }
//        if (priceElement > maxPrice) {
//            maxPrice = priceElement;
//        }
//    }
//        System.out.println("min" + minPrice);
//        System.out.println("max" + maxPrice);
//}
