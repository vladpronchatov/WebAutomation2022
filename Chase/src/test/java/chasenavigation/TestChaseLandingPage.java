package chasenavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import chasepages.ChaseLandingPage;

public class TestChaseLandingPage extends CommonAPI {

    //@Test
    public void getLandingPageTitle()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    //@Test
    public void clickOnSectionMenuTab(){
        ChaseLandingPage landingPage = PageFactory.initElements(driver, ChaseLandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    //@Test
    public void clickOnSearch(){
        ChaseLandingPage landingPage = PageFactory.initElements(driver, ChaseLandingPage.class);
        landingPage.clickOnSearch();
    }
    @Test
    public void clickOnLogIn(){
        ChaseLandingPage landingPage = PageFactory.initElements(driver, ChaseLandingPage.class);
        landingPage.clickOnLogIn();
    }

}