package Test;

import HomePageAndTestDriver.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.EducabaPage;

public class TestEducba extends TestInit {

    @Test
    public void checkTitle() {
        EducabaPage educabaPage = new EducabaPage(driver);
        String goods = "14";

        openUrl("https://www.educba.com");
        educabaPage.getOkBtn().click();
        educabaPage.getInputText().sendKeys(goods + "\n");

        Assert.assertEquals(educabaPage.getCheckInputText().getText(), "Search results for: " + goods);
    }

}
