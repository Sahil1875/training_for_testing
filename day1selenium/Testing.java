package day1selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Test");
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://www.naukri.com");
            driver.findElement(By.className("suggestor-input")).sendKeys("amdocs");
            Actions builder = new Actions(driver);
            WebElement ele = driver.findElement(By.xpath(".//*[@class='qsbSubmit']"));
            builder.moveToElement(ele).build().perform();
            builder.click(ele).build().perform();

        } catch (Exception ex) {
            ex.printStackTrace();
            driver.quit();
        }
    }
}