package cignapages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CignaLogInInfo extends CommonAPI {
    public void loginIntoCigna() throws InterruptedException {
        typeOnWebElement("username", "yourusername@gmail.com" );
        typeOnWebElement("password", "password");
        sleepFor(2);
        driver.findElement(By.id("#loginbutton")).click();
    }
}
