package BestBuyHome;

import bestbuydatasupply.BestBuyDropDownMenu;
import org.testng.annotations.Test;

public class TestBestBuyDropDownMenu extends BestBuyDropDownMenu {

    @Test
    public void fetchMenuText(){
        fetchDropDownMenu();
    }
}
