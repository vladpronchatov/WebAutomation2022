package cignanavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import cignapages.CignaFunctionality;

import java.io.IOException;

public class TestCignaFunctionality extends CommonAPI {

    @Test
    public void newsFeatures() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CignaFunctionality featureNews = PageFactory.initElements(driver, CignaFunctionality.class);
        featureNews.runAllTheFeatureTest(driver);
    }
}