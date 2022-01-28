package wsjnavigation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWSJPageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "The Wall Street Journal - Breaking News, Business, Financial & Economic News, World News and Video";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}