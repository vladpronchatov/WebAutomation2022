package wsjnavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import wsjnavigation.WSJLandingPage;

public class TestWSJLandingPage extends CommonAPI {

    //@Test
    public void getLandingPageTitle()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    //@Test
    //public void clickOnSectionMenuTab(){
    //WSJLandingPage landingPage = PageFactory.initElements(driver, WSJLandingPage.class);
    //    landingPage.clickOnSectionMenu();
    // }

    //@Test
    public void clickOnSearch(){
        WSJLandingPage landingPage = PageFactory.initElements(driver, WSJLandingPage.class);
        landingPage.clickOnSearch();
    }
    @Test
    public void clickOnLogIn(){
        WSJLandingPage landingPage = PageFactory.initElements(driver, WSJLandingPage.class);
        landingPage.clickOnLogIn();
    }

}