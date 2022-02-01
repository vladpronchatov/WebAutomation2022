package BestBuyHome;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import bestbuydatasupply.BestBuyFunctionality;
import java.io.IOException;

public class TestBestBuyFunctionality extends CommonAPI {

    @Test
    public void newsFeatures() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BestBuyFunctionality featureNews = PageFactory.initElements(driver, BestBuyFunctionality.class);
        featureNews.runAllTheFeatureTest(driver);
    }
}