package chasenavigation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChasePageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}