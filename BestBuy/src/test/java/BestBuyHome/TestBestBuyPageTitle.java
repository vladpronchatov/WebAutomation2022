package BestBuyHome;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBestBuyPageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "Best Buy | Official Online Store | Shop Now & Save";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
