package HomePageAndTestDriver;

import org.testng.annotations.Test;

public class TestWebDriver1 extends TestInit {


    @Test
    public void runGoogle() {
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("dog\n");
        googleHomePage.getSearchField().click();
    }


    @Test
    public void ClickEnterBtn() {
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getEnterBtn().click();
    }

}
