package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {
    @Test
    public void search1() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test
    public void search2() throws InterruptedException {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);
    }
}
