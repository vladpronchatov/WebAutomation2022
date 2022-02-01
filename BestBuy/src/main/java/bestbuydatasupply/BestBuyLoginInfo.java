package bestbuydatasupply;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class BestBuyLoginInfo extends CommonAPI {
    public void loginIntoBestBuy() throws InterruptedException {
        typeOnWebElement("email", "yourusername@gmail.com" );
        typeOnWebElementNEnter("password", "password");
        sleepFor(2);
    }

    public void logoutOfBestBuy() {
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