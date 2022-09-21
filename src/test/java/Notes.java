import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

public class Notes {

//    public WebDriver driver;

//        @BeforeMethod
//        public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//        @AfterMethod
//        public void tearDown() {
//        driver.quit();
//    }

//      это метод URL любой писать:
//    public void openUrl(String s) {
//        driver.get(s);
//    }
//    openUrl("https://www.educba.com");

//    это метод что бы элемент любой писать:
//        public WebElement findElementByXpath (String xpath){
//            return driver.findElement(By.xpath(xpath));
//    }
//    findElementByXpath("")

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));         неявные ожидания

//    WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))        явные ожидания
//            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("123"))));

//    public WebElement getClickableElement(String locator) {
//        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(15));
//        return waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
//    }

//    public static void main(String[] args){
//        Определенный цикл (цикл со счетчиком)
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//        Определенный цикл (цикл со счетчиком в обратном порядке)
//        for (int i = 10; i > 1; i--) {
//            System.out.println(i);
//        }
//    }

//    public static void main(String[] args){
//        Неопределенный цикл (цикл с постусловием)
//        int i = 10;
//        do выполняет код цикла, а потом проверяет условия в инструкции while
//        и пока условие истиное цикл будет повтаряться
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 20);
//    }

//    public static void main(String[] args) {
//        Неопределенный цикл (циклы с предусловием)
//        int i = 5;
//        while (i < 15) {
//            System.out.println(i);
//            i++;
//        }
//    }

//    @BeforeMethod
//    public void setUp() throws MalformedURLException {

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

    //        ChromeOptions options = new ChromeOptions();
//        DesiredCapabilities capabilities = new DesiredCapabilities(options);
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("browserVersion", "101.0");
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", false
//        ));
//
//        driver = new RemoteWebDriver(new URL("http://192.168.3.63:4444"), capabilities);
//    }

    // Массивы
//    public void Array() {
//
//        String[] cars = new String[10];
//
//        cars[9] = "BMW";
//
//        System.out.println(cars[9]);}



    //    это метод URL любой писать:
//    public void openUrl(String s) {
//        driver.get(s);
//    }
//    openUrl("https://www.educba.com");

//    это метод что бы элемент любой писать:
//        public WebElement findElementByXpath (String xpath){
//            return driver.findElement(By.xpath(xpath));
//    }
//    findElementByXpath("")

//    явное ожидане для веб элементов(то есть кодга их много)
//    public List<WebElement> findElementsByXpath(String xpath) {
//        return getClickableElements(xpath);
//    }
//    public List<WebElement> getClickableElements(String locator) {
//        WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(15));
//        return waitClick.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
//    }

//    это прописывать для движение мышки
//@Step("Move cursor to 'Product catalogue' menu")
//public HomePage moveToProductCatalogueMenu() {
//    moveToElement(driver, driver.findElement(By.xpath("//div[@class='menu__button ']")));
//    return this;
//}
//    метод для движения мышки (его лучше в блок отдельно в проекте закидывать(unit))
//public static void moveToElement(WebDriver driver, WebElement element) {
//    Actions actions = new Actions(driver);
//    actions.moveToElement(element).pause(2).perform();
//}


}
