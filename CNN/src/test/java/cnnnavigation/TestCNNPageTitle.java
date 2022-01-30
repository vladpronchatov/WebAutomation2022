package cnnnavigation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCNNPageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "CNN - Breaking News, Latest News and Videos";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}