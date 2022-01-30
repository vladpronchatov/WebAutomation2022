package chasepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChaseSectionMenuPage {

    @FindBy(how = How.CSS, using = "#skip-sidemenu")
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS, using = "#skip-sidemenu li:nth-child(1) a")
    public static WebElement checkingSectionWebElement;

    @FindBy(how = How.CSS, using = "#skip-sidemenu li:nth-child(2) a")
    public static WebElement creditCardsSectionWebElement;

    @FindBy(how = How.CSS, using = "#skip-sidemenu li:nth-child(3) a")
    public static WebElement homeLoanSectionWebElement;

    @FindBy(how = How.CSS, using = "#skip-sidemenu li:nth-child(4) a")
    public static WebElement automobileSectionWebElement;

    @FindBy(how = How.CSS, using = "#skip-sidemenu li:nth-child(5) a")
    public static WebElement chaseInvestmentsSectionWebElement;

    @FindBy(how = How.CSS, using = "#skip-sidemenu li:nth-child(7) a")
    public static WebElement chaseBusinessSectionWebElement;

    @FindBy(how = How.CSS, using = "#skip-sidemenu li:nth-child(8) a")
    public static WebElement chaseCommercialSectionWebElement;

    public void clickOnChaseSectionMenu(){
        sectionMenuWebElement.click();
    }
    public ChaseCheckingPage goToChaseCheckingPage(WebDriver driver){
        checkingSectionWebElement.click();

        return new ChaseCheckingPage(driver);
    }

    public ChaseCreditCardsPage goToChaseCreditCardsPage(WebDriver driver){
        creditCardsSectionWebElement.click();

        return new ChaseCreditCardsPage(driver);
    }
    public ChaseHomeLoanPage goToChaseHomeLoanPage(WebDriver driver){
        homeLoanSectionWebElement.click();

        return new ChaseHomeLoanPage(driver);
    }
    public ChaseAutomobilePage goToChaseAutomobilePage(WebDriver driver){
        automobileSectionWebElement.click();

        return new ChaseAutomobilePage(driver);
    }
    public ChaseInvestmentsPage goToChaseInvestmentsPage(WebDriver driver){
        chaseInvestmentsSectionWebElement.click();

        return new ChaseInvestmentsPage(driver);
    }

    public ChaseBusinessPage goToChaseBusinessPage(WebDriver driver){
        chaseBusinessSectionWebElement.click();

        return new ChaseBusinessPage(driver);
    }

    public ChaseCommercialPage goToChaseCommercialPage(WebDriver driver){
        chaseCommercialSectionWebElement.click();

        return new ChaseCommercialPage(driver);
    }
}