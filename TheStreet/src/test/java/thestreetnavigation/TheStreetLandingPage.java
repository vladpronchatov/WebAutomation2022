package thestreetnavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import thestreetpages.TheStreetLandingPage;

public class TheStreetLandingPage extends CommonAPI {

    //@Test
    public void getLandingPageTitle()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    //@Test
    public void clickOnSectionMenuTab(){
        TheStreetLandingPage landingPage = PageFactory.initElements(driver, TheStreetLandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    //@Test
    public void clickOnSearch(){
        TheStreetLandingPage landingPage = PageFactory.initElements(driver, TheStreetLandingPage.class);
        landingPage.clickOnSearch();
    }
    @Test
    public void clickOnLogIn(){
        TheStreetLandingPage landingPage = PageFactory.initElements(driver, TheStreetLandingPage.class);
        landingPage.clickOnLogIn();
    }

}