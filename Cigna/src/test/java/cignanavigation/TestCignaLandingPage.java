package cignanavigation;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import javax.swing.*;
import cignapages.CignaLandingPage;

public class TestCignaLandingPage extends CommonAPI {

    @Test
    public void landOnHomePage()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
    @Test
    public void getLandingPageTitle()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
    @Test
    public void clickOnSectionMenuTab(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnSectionMenu();
    }
    @Test
    public void clickOnSearch(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnSearch();
    }
    @Test
    public void clickOnLogIn(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnLogIn();
    }
    @Test
    public void clickOnFindDoctor(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnFindDoctor();
    }
    @Test
    public void clickOnIndividuals(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnIndividuals();
    }
    @Test
    public void clickOnMedicare(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnMedicare();
    }
    @Test
    public void clickOnEmployers(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnEmployers();
    }
    @Test
    public void clickOnBrokers(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnBrokers();
    }
    @Test
    public void clickOnHealthCareProviders(){
        CignaLandingPage landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnHealthCareProviders();
    }
}