package githubnavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import githubpages.GHFunctionality;

import java.io.IOException;

public class TestGHFunctionality extends CommonAPI {

    @Test
    public void newsFeatures() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GHFunctionality featureNews = PageFactory.initElements(driver, GHFunctionality.class);
        featureNews.runAllTheFeatureTest(driver);
    }
}