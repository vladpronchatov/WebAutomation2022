package githubnavigation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import githubpages.GHLoginInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGHLogin extends GHLoginInfo {
    @Test
    public void login() throws InterruptedException {
        loginIntoGitHub();
    }
}