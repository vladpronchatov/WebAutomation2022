package FacebookDataSupply;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookSearchPage {

    @FindBy(how = How.CSS,using = ".site-header__search-toggle")
    public static WebElement searchIconWebElement;

    @FindBy(how = How.CSS,using = ".form-control.search-basic-input")
    public static WebElement searchInputFieldWebElement;

    @FindBy(how = How.CSS,using = ".input-group-addon.btn.btn-tertiary")
    public static WebElement searchSubmitButtonWebElement;

    public void searchIcon(){
        searchIconWebElement.click();
    }

    public void typeOnSearchField(String value){
        searchInputFieldWebElement.sendKeys(value, Keys.ENTER);
    }
    public void clickOnSubmitButton(){
        searchSubmitButtonWebElement.click();
    }
    public void clickOnSearchButton(){
        searchSubmitButtonWebElement.click();
    }
}