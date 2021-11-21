package Selenium;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launches a new browser session

        driver.get("https://www.duotech.io/"); // navigates to a URL

        driver.findElement(By.linkText("About")).click();

        driver.findElement(By.partialLinkText("Con")).click();

    }
}
