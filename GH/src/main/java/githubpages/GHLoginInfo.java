package githubpages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class GHLoginInfo extends CommonAPI {

    public void loginIntoGitHub() throws InterruptedException {
        typeOnWebElement("login", "yourusername@gmail.com" );
        typeOnWebElement("password", "password");
        sleepFor(2);
        driver.findElement(By.className(".btn.btn-primary.btn-block.js-sign-in-button")).click();
    }
}