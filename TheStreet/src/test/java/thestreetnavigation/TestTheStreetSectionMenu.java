package thestreetnavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import thestreetpages.TheStreetSectionMenuPage;

public class TestTheStreetSectionMenu extends CommonAPI {

    @Test
    public void sectionMenu(){
        TheStreetSectionMenuPage sectionMenuPage = PageFactory.initElements(driver, TheStreetSectionMenuPage.class);
        sectionMenuPage.clickOnSectionMenu();
        sectionMenuPage.goToMetroPage(driver).getHeadLineNewsText();
    }
}
