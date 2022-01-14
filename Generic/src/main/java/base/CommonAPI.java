package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @BeforeMethod
    public void launchBrowserInstance(){
        System.setProperty("webdriver.chrome.driver","/Users/matiur/develop/aint/WebAutomationNovember2021/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUP(){
        driver.close();
    }
}
