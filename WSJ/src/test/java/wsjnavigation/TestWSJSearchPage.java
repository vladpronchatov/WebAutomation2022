package wsjnavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import wsjpages.WSJSearchPage;

public class TestWSJSearchPage extends CommonAPI {

    @Test
    public void search(){
        WSJSearchPage searchPage = PageFactory.initElements(driver, WSJSearchPage.class);
        searchPage.searchIconClickNEnterNewsNSubmit();

    }
}