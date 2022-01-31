package wsjnavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

import wsjpages.WSJFunctionality;


public class TestWSJFunctionality extends CommonAPI {

    @Test
    public void newsFeatures() throws IOException, InterruptedException {
        WSJFunctionality featureNews = PageFactory.initElements(driver, WSJFunctionality.class);
        featureNews.runAllTheFeatureTest(driver);
    }
}