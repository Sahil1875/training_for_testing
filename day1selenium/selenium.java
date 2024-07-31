package day1selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = null;

        try {
            driver = new FirefoxDriver();
            driver.get("https://yahoo.com");
            System.out.println("Title: " + driver.getTitle());
            Thread.sleep(10000);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}