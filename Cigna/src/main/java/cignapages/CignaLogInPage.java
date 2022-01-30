package cignapages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CignaLogInPage {

    @FindBy(how = How.CSS, using = "#username")
    public static WebElement emailFieldWebElement;

    @FindBy(how = How.CSS, using = "#password")
    public static WebElement passwordFieldWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginbutton\"]")
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
