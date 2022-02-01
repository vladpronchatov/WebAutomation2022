package cignapages;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import cignafetch.FetchCignaSteps;

import java.io.IOException;

public class CignaFunctionality {

    CignaLandingPage landingPage = null;
    CignaSearchPage searchPage = null;
    CignaLogInPage logInPage = null;

    String captureUrl = "https://cigna.com";

    public void logIn(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        logInPage = PageFactory.initElements(driver, CignaLogInPage.class);
        landingPage.clickOnLogIn();
        logInPage.enterEmailAddress("abc123@gmail.com");
        logInPage.enterPassword("abc123");
        //logInPage.clickOnLogInSubmitButton();
    }
    public void search(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnSearch();
        searchPage = PageFactory.initElements(driver, CignaSearchPage.class);
    }

    public void clickOnSectionMenu(WebDriver driver)throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage = PageFactory.initElements(driver, CignaLandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    public void runAllTheFeatureTest(WebDriver driver) throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FetchCignaSteps fetchTheSteps = new FetchCignaSteps();
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