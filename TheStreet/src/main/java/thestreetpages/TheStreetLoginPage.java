package thestreetpages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TheStreetLoginPage extends CommonAPI {

    public void loginIntoTheStreet() throws InterruptedException {
        typeOnWebElement("email", "yourusername@gmail.com" );
        typeOnWebElement("pass", "password");
        sleepFor(2);
        driver.findElement(By.id("u_0_2")).click();
    }

    public void logoutOfTheStreet() {
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