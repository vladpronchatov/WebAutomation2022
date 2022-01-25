package cignanavigation;

import base.CommonAPI;
import org.testng.annotations.Test;
import javax.swing.*;

public class TestCignaLandingPage extends CommonAPI {

    @Test
    public void landOnHomePage()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
}