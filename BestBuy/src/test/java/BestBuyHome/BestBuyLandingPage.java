package BestBuyHome;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import javax.swing.*;

public class BestBuyLandingPage extends CommonAPI {

    @Test
    public void landOnHomePage()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    @FindBy(how = How.CSS, using = ".c-button-unstyled.hamburger-menu-button")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = "#gh-search-input")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".c-button.c-button-secondary.c-button-sm.sign-in-btn")
    public static WebElement logInWebElement;

    @FindBy(how = How.CSS, using = ".cia-form__controls")
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