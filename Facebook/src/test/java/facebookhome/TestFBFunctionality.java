package facebookhome;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import FacebookDataSupply.FBFunctionality;
import java.io.IOException;

public class TestFBFunctionality extends CommonAPI {

    @Test
    public void newsFeatures() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FBFunctionality featureNews = PageFactory.initElements(driver, FBFunctionality.class);
        featureNews.runAllTheFeatureTest(driver);
    }
}