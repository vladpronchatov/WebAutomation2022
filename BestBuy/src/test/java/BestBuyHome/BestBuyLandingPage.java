package BestBuyHome;

import base.CommonAPI;
import org.testng.annotations.Test;
import javax.swing.*;

public class BestBuyLandingPage extends CommonAPI {

    @Test
    public void landOnHomePage()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
}
