package githubpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GHSearchPage {

    @FindBy(how = How.CSS,using = "#search_form > div > div > input.form-control.input-block")
    public static WebElement searchInputFieldWebElement;

    @FindBy(how = How.CSS,using = "#search_form > div > button")
    public static WebElement searchSubmitButtonWebElement;

    public void typeOnSearchField(String value){
        searchInputFieldWebElement.sendKeys(value, Keys.ENTER);
    }
    public void clickOnSearchButton(){
        searchSubmitButtonWebElement.click();
    }
}