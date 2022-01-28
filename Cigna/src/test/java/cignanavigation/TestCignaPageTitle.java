package cignanavigation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCignaPageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "Cigna Official Site  | Global Health Service Company";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}