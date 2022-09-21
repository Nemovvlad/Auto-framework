package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestOne {

    @Test
    public void doit() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.ua");
    }

    @Test
    public void kyivstar() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kyivstar.ua/");
        driver.findElement(By.xpath("//span[@class=\"btn__content\"][contains(text(),'Так')]")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1100)", "");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tariffBlock\"]/div/div[1]/div/div/div/div[2]/div/div/div/div/button")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Так')]")).click();

    }

}