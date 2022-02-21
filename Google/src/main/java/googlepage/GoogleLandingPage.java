package googlepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleLandingPage{

    @FindBy(how = How.CSS, using = "#gbwa > div > a")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS,using = "#input")
    public static WebElement searchInputFieldWebElement;

    public void clickOnSearchNSubmit(String value){
        searchInputFieldWebElement.sendKeys(value, Keys.ENTER);
    }
    public void clickOnSectionMenu(){
        sectionNavBarWebElement.click();
    }
}
