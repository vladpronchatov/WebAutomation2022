package chasenavigation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import chasepages.ChaseLoginInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TestChaseLogin extends ChaseLoginInfo {
    @Test
    public void login() throws InterruptedException {
        loginIntoChase();
    }
}