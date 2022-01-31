package githubnavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import githubpages.GHLandingPage;

public class TestGHLandingPage extends CommonAPI {

    //@Test
    public void getLandingPageTitle()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    //@Test
    public void clickOnSectionMenuTab(){
        GHLandingPage landingPage = PageFactory.initElements(driver, GHLandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    //@Test
    public void clickOnSearch(){
        GHLandingPage landingPage = PageFactory.initElements(driver, GHLandingPage.class);
        landingPage.clickOnSearch();
    }
    @Test
    public void clickOnLogIn(){
        GHLandingPage landingPage = PageFactory.initElements(driver, GHLandingPage.class);
        landingPage.clickOnLogIn();
    }

}