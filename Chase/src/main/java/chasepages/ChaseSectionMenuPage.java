package chasepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChaseSectionMenuPage {

    @FindBy(how = How.CSS, using = ".menu-toggle__title")
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2) a")
    public static WebElement checkingSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(4) a")
    public static WebElement automobileSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(7) a")
    public static WebElement chaseBusinessSectionWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(9) a")
    public static WebElement homeLoanSectionWebElement;

    public void clickOnChaseSectionMenu(){
        sectionMenuWebElement.click();
    }
    public ChaseCheckingPage goToChaseCheckingPage(WebDriver driver){
        checkingSectionWebElement.click();

        return new ChaseCheckingPage(driver);
    }

    public ChaseBusinessPage goToChaseBusinessPage(WebDriver driver){
        chaseBusinessSectionWebElement.click();

        return new ChaseBusinessPage(driver);
    }

    public ChaseHomeLoanPage goToChaseHomeLoanPage(WebDriver driver){
        homeLoanSectionWebElement.click();

        return new ChaseHomeLoanPage(driver);
    }

    public ChaseAutomobilePage goToChaseAutomobilePage(WebDriver driver){
        automobileSectionWebElement.click();

        return new ChaseAutomobilePage(driver);
    }
}