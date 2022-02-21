package googlenavigation;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import googlepage.GoogleLandingPage;
import reporting.TestLogger;
import googlefetch.FetchGoogleSteps;
import java.io.IOException;

public class TestGoogle extends CommonAPI {

    @Test
    public void getLandingPageTitle()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    @Test
    public void clickOnSectionMenuTab(){
        GoogleLandingPage landingPage = PageFactory.initElements(driver, GoogleLandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    @Test
    public void clickOnSearch(){
        GoogleLandingPage landingPage = PageFactory.initElements(driver, GoogleLandingPage.class);
        //landingPage.clickOnSearch();
    }
public class AllFunctionality {

    GoogleLandingPage landingPage = null;

    String captureUrl = "https://google.com";

    public void search(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage = PageFactory.initElements(driver, GoogleLandingPage.class);
        landingPage.clickOnSearchNSubmit();
    }

    public void clickOnSectionMenu(WebDriver driver)throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage = PageFactory.initElements(driver, GoogleLandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    public void sectionsMenu(WebDriver driver, String capturedUrl)throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try {
            clickOnSectionMenu(driver);
        }catch (Exception ex){
            driver.navigate().to(capturedUrl);
            clickOnSectionMenu(driver);
        }
        sectionPage = PageFactory.initElements(driver,SectionMenuPage.class);
        String headLineNews = sectionPage.goToMetroPage(driver).getHeadLineNewsText();
        System.out.println(headLineNews);
        clickOnSectionMenu(driver);
        sectionPage.goToBusinessPage(driver).getHeadLineNewsText();
        clickOnSectionMenu(driver);
        sectionPage.goToEntertainmentPage(driver).getHeadLineNewsText();
    }

    public void select(String featureName, WebDriver driver)throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        switch(featureName){
            case "signUp":
                logIn(driver);
                break;
            case "sectionsMenu":
                sectionsMenu(driver,captureUrl);
                break;
            case "search":
                search(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
}