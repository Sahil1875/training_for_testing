package day2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class exercise1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Test");
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        try {
            driver.get("https://www.yahoo.com");
            driver.findElement(By.id("ybar-sbq")).sendKeys("amdocs");
            Actions builder=new Actions(driver);
            WebElement ele=driver.findElement(By.xpath(".//*[@id='ybar-search']"));
            builder.moveToElement(ele).build().perform();
            builder.click(ele).build().perform();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            driver.quit();
        }
    }
}