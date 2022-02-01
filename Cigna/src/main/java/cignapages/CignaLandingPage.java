package cignapages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CignaLandingPage extends CommonAPI {

    @FindBy(how = How.CSS, using = ".navbar-toggler.navbar-toggler-right.btn.btn-sm.btn-flat-secondary")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ssi-includes\"]/div/header/div[2]/nav[1]/div/ul/li[4]/form/div/div/span/button")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".btn.btn-sm.btn-primary")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = "#loginbutton")
    public static WebElement logInSubmitWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ssi-includes\"]/div/header/div[2]/nav[2]/div/ul/li[1]/a")
    public static WebElement findDoctorWebElement;

    @FindBy(how = How.CSS, using = "#individuals-families")
    public static WebElement individualsWebElement;

    @FindBy(how = How.CSS, using = "#medicare")
    public static WebElement medicareWebElement;

    @FindBy(how = How.CSS, using = "#employers-brokers")
    public static WebElement employersWebElement;

    @FindBy(how = How.CSS, using = "#brokers")
    public static WebElement brokersWebElement;

    @FindBy(how = How.CSS, using = "#health-care-providers")
    public static WebElement healthCareProvidersWebElement;

    public void clickOnSectionMenu(){
        sectionNavBarWebElement.click();
    }
    public void clickOnSearch(){
        searchWebElement.click();
    }
    public void clickOnLogIn(){
        logInWebElement.click();
    }
    public void clickOnLogInSubmitButton(){
        logInSubmitWebElement.click();
    }
    public void clickOnFindDoctor(){
        findDoctorWebElement.click();
    }
    public void clickOnMedicare(){
        medicareWebElement.click();
    }
    public void clickOnIndividuals(){
        individualsWebElement.click();
    }
    public void clickOnEmployers(){
        employersWebElement.click();
    }
    public void clickOnBrokers(){
        brokersWebElement.click();
    }
    public void clickOnHealthCareProviders(){
        healthCareProvidersWebElement.click();
    }
}