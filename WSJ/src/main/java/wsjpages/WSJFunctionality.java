package wsjpages;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import base.CommonAPI;
import wsjdatafetch.FetchWSJSteps;


public class WSJFunctionality {

    WSJLandingPage landingPage = null;
    //SectionMenuPage sectionPage = null;
    WSJSearchPage searchPage = null;
    WSJLoginPage logInPage = null;

    public void signUp(WebDriver driver){
        landingPage = PageFactory.initElements(driver, WSJLandingPage.class);
        logInPage = PageFactory.initElements(driver, WSJLoginPage.class);
        landingPage.clickOnLogIn();
        logInPage.enterEmailAddress("abc123@gmail.com");
        logInPage.clickOnSignUp();
    }
    public void search(WebDriver driver){
        landingPage = PageFactory.initElements(driver, WSJLandingPage.class);
        landingPage.clickOnSearch();
        searchPage = PageFactory.initElements(driver, WSJSearchPage.class);
        searchPage.searchIconClickNEnterNewsNSubmit();
    }

    //public void clickOnSectionMenu(WebDriver driver)throws InterruptedException {
    //    landingPage = PageFactory.initElements(driver, WSJLandingPage.class);
    //    landingPage.clickOnSectionMenu();
    //}

    //public void sectionsMenu(WebDriver driver)throws InterruptedException {
    //    clickOnSectionMenu(driver);
    //    sectionPage = PageFactory.initElements(driver,SectionMenuPage.class);
    //    String headLineNews = sectionPage.goToMetroPage(driver).getHeadLineNewsText();
    //    System.out.println(headLineNews);
    //    clickOnSectionMenu(driver);
    //    sectionPage.goToBusinessPage(driver).getHeadLineNewsText();
    //    clickOnSectionMenu(driver);
    //  sectionPage.goToEntertainmentPage(driver).getHeadLineNewsText();
    //}

    public void runAllTheFeatureTest(WebDriver driver) throws InterruptedException, IOException {
        FetchWSJSteps fetchTheSteps = new FetchWSJSteps();
        String[] featureSteps = fetchTheSteps.getDataFromExcelFile();
        for (int i=1; i<featureSteps.length; i++){
          select(featureSteps[i], driver);
      }
    }
    public void select(String featureName, WebDriver driver)throws InterruptedException, IOException {
        switch(featureName){
            case "signUp":
                signUp(driver);
                break;
            //case "sectionsMenu":
            //    sectionsMenu(driver);
            //    break;
            case "search":
                search(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
}