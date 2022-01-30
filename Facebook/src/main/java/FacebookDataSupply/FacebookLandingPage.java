package FacebookDataSupply;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLandingPage extends CommonAPI {

    @FindBy(how = How.CSS, using = ".navbar-toggler.navbar-toggler-right.btn.btn-sm.btn-flat-secondary")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = "./html/body/div[2]/div[1]/div/div[1]/div/div[2]/div/div/div/header/div[2]/nav[1]/div/ul/li[4]/form/div/div/span/button")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".btn.btn-sm.btn-primary")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = "#loginbutton")
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