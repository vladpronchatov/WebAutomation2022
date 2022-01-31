package BestBuyHome;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import bestbuydatasupply.BestBuyLoginInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestBestBuyLogin extends BestBuyLoginInfo {

    @Test
    public void login() throws InterruptedException {
        loginIntoBestBuy();

    }
}