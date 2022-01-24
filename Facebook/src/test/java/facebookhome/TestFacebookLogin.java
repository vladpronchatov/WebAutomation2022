package facebookhome;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFacebookLogin {
    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
        login.click();
        String actualUrl = "https://www.facebook.com/";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}