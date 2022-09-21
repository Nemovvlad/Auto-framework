package Test;

import HomePageAndTestDriver.TestInit;
import org.testng.annotations.Test;
import pageObjects.MakeupPage;

import javax.swing.*;
import java.awt.*;

public class MakeupRegisterTest extends TestInit {

    @Test
    public void checkRegister(){
        MakeupPage makeupPage = new MakeupPage(driver);
        openUrl("https://makeup.com.ua/");
        makeupPage.mouseMoved(10);
    }
}

