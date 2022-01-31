package githubnavigation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGHPageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "GitHub: Where the world builds software · GitHub";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}