package FacebookDataSupply;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FacebookLoginInfo extends CommonAPI {

        public static void main(String[] args) throws InterruptedException
        {
            System.setProperty("webdriver.chrome.driver", ");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com");
            driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("password");
            Thread.sleep(5000);
            driver.findElement(By.id("u_0_2")).click();
            Thread.sleep(7000);
        }
    }

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement Login = driver.findElement(By.id("u_0_v"));
        username.sendKeys("myusername@xyz.com");
        password.sendKeys("mypassword");
        Login.click();
        Thread.sleep(2000);

        WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
        WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
        navigationclick.click();
        if (logout.isEnabled() && logout.isDisplayed()) {
            logout.click();
        } else {
            System.out.println("Element not found");
        }
    }
}

