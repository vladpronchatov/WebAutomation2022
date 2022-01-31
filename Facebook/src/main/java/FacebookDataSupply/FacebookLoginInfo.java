package FacebookDataSupply;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FacebookLoginInfo extends CommonAPI {
    public void loginIntoFacebook() throws InterruptedException {
        typeOnWebElement("email", "webautomation2022@gmail.com");
        typeOnWebElementNEnter("pass", "Vl@dislav1");
        sleepFor(2);
        //driver.findElement(By.id("u_0_h_rd")).click();
        System.out.println("Successful Login");


        //driver.findElement(By.id("userNavigationLabel")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.partialLinkText("Log out")).click();
        //System.out.println("Successfully logged out");
    }

}
