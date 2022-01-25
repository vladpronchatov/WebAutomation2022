package cignanavigation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import cignapages.CignaLogInInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCignaLogIn extends CignaLogInInfo {

    @Test
    public void login() throws InterruptedException {
        loginIntoCigna();

    }
}