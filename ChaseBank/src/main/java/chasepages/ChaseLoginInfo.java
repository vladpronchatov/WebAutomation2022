package chasepages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ChaseLoginInfo extends CommonAPI {

    public void loginIntoChase() throws InterruptedException {
        typeOnWebElement("userId", "yourusername@gmail.com" );
        typeOnWebElement("password", "password");
        sleepFor(2);
        driver.findElement(By.className(".btn.btn-primary.btn-block.js-sign-in-button")).click();
    }

    public void logoutOfChase() {
        WebElement navigationClick = driver.findElement(By.className(".dropdown-item.dropdown-signout"));
        WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button"));
        navigationClick.click();
        if (logout.isEnabled() && logout.isDisplayed()) {
            logout.click();
        } else {
            System.out.println("Element not found");
        }
    }
}