package wsjpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WSJLandingPage {

    @FindBy(how = How.CSS, using = ".style--search-button--2p_I8aS1")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = "style--masthead-strap-link--2zBu5pWD")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = ".input-container")
    public static WebElement logInSubmitWebElement;

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