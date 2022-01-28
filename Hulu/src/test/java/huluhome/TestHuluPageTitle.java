package huluhome;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHuluPageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "Stream TV and Movies Live and Online | Hulu";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}