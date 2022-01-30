package facebookhome;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestFacebookLandingPage extends CommonAPI {

    @Test
    public void landOnHomePage()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
}