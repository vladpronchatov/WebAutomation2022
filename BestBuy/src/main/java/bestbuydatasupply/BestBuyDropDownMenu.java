package bestbuydatasupply;

import base.CommonAPI;
import org.testng.Assert;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BestBuyDropDownMenu extends CommonAPI {

    public void fetchDropDownMenu(){
        List<String> expectedMenuItems = getListOfTest(".c-button-unstyled.hamburger-menu-button option");
        List<String> actualMenuItems = expectedMenuItems;
        Assert.assertEquals(actualMenuItems,expectedMenuItems);
        for(String menu:expectedMenuItems){
            System.out.println(menu);
        }
    }
}
