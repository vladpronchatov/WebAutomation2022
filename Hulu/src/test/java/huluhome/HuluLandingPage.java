package huluhome;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import javax.swing.*;

public class HuluLandingPage extends CommonAPI {

    @Test
    public void landOnHomePage()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    @Test
    public void clickOnLogIn(){
        HuluLandingPage landingPage = PageFactory.initElements(driver, HuluLandingPage.class);
        landingPage.clickOnLogIn();
    }

    //@Test
    //public void clickOnSectionMenuTab(){
    //    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    //    landingPage.clickOnSectionMenu();
    //}

    //@Test
    //public void clickOnSearch(){
    //    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    //    landingPage.clickOnSearch();
    //}
}