package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launches a new browser session

        driver.get("https://www.amazon.com/"); // navigates to a URL

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("socks" + Keys.ENTER);
    }
}
