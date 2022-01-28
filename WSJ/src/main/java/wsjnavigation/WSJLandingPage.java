package wsjnavigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WSJLandingPage {

    //@FindBy(how = How.CSS, using = ".menu-toggle__title")
    //public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = ".style--search-button--2p_I8aS1")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = "style--masthead-strap-link--2zBu5pWD")
    public static WebElement logInWebElement;



    //public void clickOnSectionMenu(){
    //   sectionNavBarWebElement.click();
    //}
    public void clickOnSearch(){
        searchWebElement.click();
    }
    public void clickOnLogIn(){
        logInWebElement.click();
    }
}