package chasepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChaseLandingPage {

    @FindBy(how = How.CSS, using = "#skip-sidemenu")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = ".header-navigation__search--icon.icon-search")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".btn.btn--primary.chaseanalytics-track-link.signInBtn")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = "#signin-button")
    public static WebElement logInSubmitWebElement;

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
}