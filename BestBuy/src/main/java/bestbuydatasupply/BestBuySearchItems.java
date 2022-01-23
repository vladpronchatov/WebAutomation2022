package bestbuydatasupply;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public class BestBuySearchItems extends CommonAPI {

    public void itemsSearch() throws Exception {
        BestBuySuppleData suppleData = new BestBuySuppleData();
        List<String> items = suppleData.getItemListFromDB();
        for(String item:items) {
            typeOnWebElement("gh-search-input",item);
            Thread.sleep(500);
            clearInputBox("gh-search-input");
        }
    }
}