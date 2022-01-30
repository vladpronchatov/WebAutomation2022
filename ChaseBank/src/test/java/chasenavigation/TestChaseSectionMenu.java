package chasenavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import chasepages.ChaseSectionMenuPage;

public class TestChaseSectionMenu extends CommonAPI{

    @Test
    public void sectionMenu(){
        ChaseSectionMenuPage sectionMenuPage = PageFactory.initElements(driver, ChaseSectionMenuPage.class);
        //sectionMenuPage.clickOnSectionMenu();
        //sectionMenuPage.goToBusinessPage(driver).getHeadLineNewsText();
    }
}