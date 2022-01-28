package wsjpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WSJSearchPage {

    @FindBy(how = How.CSS,using = "span.search-text")
    public static WebElement searchIconWebElement;

    @FindBy(how = How.CSS,using = ".style--wsj-search-input--2m4pqsLm ")
    public static WebElement searchInputFieldWebElement;

    @FindBy(how = How.CSS,using = ".style--search-submit--1LH_mj9U")
    public static WebElement searchSubmitButtonWebElement;

    public void searchIcon(){
        searchIconWebElement.click();
    }

    public void typeOnSearchField(String value){
        searchInputFieldWebElement.sendKeys(value);
    }
    public void clickOnSubmitButton(){
        searchSubmitButtonWebElement.click();
    }
    public void searchIconClickNEnterNewsNSubmit(){
        searchIcon();
        typeOnSearchField("covid-19");
        clickOnSubmitButton();
    }
    public void clickOnSearchButton(){
        searchSubmitButtonWebElement.click();
    }

}