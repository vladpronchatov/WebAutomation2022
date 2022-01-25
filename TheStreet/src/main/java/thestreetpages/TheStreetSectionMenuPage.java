package thestreetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TheStreetSectionMenuPage {

    @FindBy(how = How.CSS, using = ".menu-toggle__title")
    public static WebElement sectionMenuWebElement;

    public void clickOnSectionMenu() {
        sectionMenuWebElement.click();
    }
}