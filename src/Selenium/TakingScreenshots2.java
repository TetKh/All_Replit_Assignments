package Selenium;

import Selenium.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakingScreenshots2 {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("os.name").contains("Windows") ? "drivers/chromedriver.exe" : "drivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.manage().window().maximize();


        driver.get("https://www.dice.com/");

        Utilities.takeScreenshot(driver, "dice.png");


    }
}
