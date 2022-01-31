package chasepages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChaseLoginPage {

    @FindBy(how = How.CSS, using = "#userId-text-input-field")
    public static WebElement emailFieldWebElement;

    @FindBy(how = How.CSS, using = "#password-text-input-field")
    public static WebElement passwordFieldWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"signin-button\"]")
    public static WebElement logInButtonWebElement;

    public static WebElement getEmailFieldWebElement(){
        return emailFieldWebElement;
    }
    public static WebElement getPasswordFieldWebElement() {
        return passwordFieldWebElement;
    }
    public static WebElement getLogInButtonWebElement(){
        return logInButtonWebElement;
    }

    public void enterEmailAddress(String value){
        getEmailFieldWebElement().sendKeys(value);
    }
    public void enterPassword(String value){
        getPasswordFieldWebElement().sendKeys(value, Keys.ENTER);
    }
    public void clickOnLogInSubmitButton(){
        getLogInButtonWebElement().click();
    }
}
