package bestbuydatasupply;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BestBuyLandingPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "/html/body/div[1]/header/div/div[1]/div[2]/button")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[2]/div[2]/div[1]/div/div/form/label/input[1]")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".HeaderMenu-link.flex-shrink-0.no-underline")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = ".btn.btn-primary.btn-block.js-sign-in-button")
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