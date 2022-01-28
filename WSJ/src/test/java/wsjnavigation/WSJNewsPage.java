package wsjnavigation;

import base.CommonAPI;
import org.testng.annotations.Test;

public class WSJNewsPage extends CommonAPI {

    @Test
    public void home(){
        System.out.println(driver.getTitle());
    }
}