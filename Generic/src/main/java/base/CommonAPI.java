package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void launchBrowserInstance(String url){
        System.setProperty("webdriver.chrome.driver","/Users/mrahman/develop/aint/session/sdetNovember2021/WebAutomation-Nobemver2021/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUP(){
        driver.close();
    }

    //Selenium API's
    public void typeOnWebElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1){
            try{
                driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
            }catch (Exception ex2){
                try {
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }
    public void clearInputBox(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        }catch (Exception ex1){
            try{
                driver.findElement(By.id(locator)).clear();
            }catch (Exception ex2){
                try {
                    driver.findElement(By.className(locator)).clear();
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).clear();
                }
            }
        }
    }

    public List<String> getListOfTest(String locator){
        List<WebElement> webElementList = driver.findElements(By.cssSelector(locator));
        List<String> listOfText = new ArrayList<>();
        for(WebElement element:webElementList){
            listOfText.add(element.getText());
        }
        return listOfText;
    }
}
