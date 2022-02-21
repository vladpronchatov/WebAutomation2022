package FacebookDataSupply;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import fbfetch.FetchFBSteps;
import java.io.IOException;

public class FBFunctionality {

    FacebookLandingPage landingPage = null;
    FacebookSearchPage searchPage = null;
    FacebookLoginPage logInPage = null;

    public void logIn(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage = PageFactory.initElements(driver, FacebookLandingPage.class);
        logInPage = PageFactory.initElements(driver, FacebookLoginPage.class);
        landingPage.clickOnLogIn();
        //logInPage.enterEmailAddress("abc123@gmail.com");
        //logInPage.enterPassword("abc123");
        //logInPage.clickOnLogInSubmitButton();
    }
    public void search(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage = PageFactory.initElements(driver, FacebookLandingPage.class);
        landingPage.clickOnSearch();
        searchPage = PageFactory.initElements(driver, FacebookSearchPage.class);
    }

    public void runAllTheFeatureTest(WebDriver driver) throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FetchFBSteps fetchTheSteps = new FetchFBSteps();
        String[] featureSteps = fetchTheSteps.getDataFromExcelFile();
        for (int i=1; i<featureSteps.length; i++){
            select(featureSteps[i], driver);
        }
    }
    public void select(String featureName, WebDriver driver)throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        switch(featureName){
            case "signUp":
                logIn(driver);
                break;
            case "search":
                search(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
}