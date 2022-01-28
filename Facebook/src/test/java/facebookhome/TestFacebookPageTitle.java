package facebookhome;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacebookPageTitle extends CommonAPI {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "Facebook - Log In or Sign Up";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}