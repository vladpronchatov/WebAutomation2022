package facebookhome;

import java.util.concurrent.TimeUnit;

import FacebookDataSupply.FacebookLoginInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacebookLogin extends FacebookLoginInfo {
    @Test
    public void login() throws InterruptedException {
        loginIntoFacebook();

    }
}