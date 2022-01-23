package BestBuyHome;


import base.CommonAPI;
import bestbuydatasupply.BestBuySearchItems;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestBestBuySearch extends BestBuySearchItems{

    @Test
    public void searchItems() throws Exception {
        itemsSearch();
    }
}

