package thestreetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TheStreetTechnologyPage {

    private final WebDriver driver;

    public TheStreetTechnologyPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.CSS, using = "")
    public static WebElement headLineNewsWebElement;

    public String getHeadLineNewsText() {
        String headLine = headLineNewsWebElement.getText();

        return headLine;
    }
}