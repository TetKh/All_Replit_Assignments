package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;

public class TestSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.youtube.com/";

//        if(currentURL.equals(expectedURL)){
//            System.out.println("Passed");
//        }else{
//            System.out.println("Failed");
//        }

        assertEquals(currentURL, expectedURL);
        String actualTitle = driver.getTitle();
        String excpectedTitle = "YouTube";
        assertTrue(actualTitle.contains(excpectedTitle));

        String pageSource = driver.getPageSource();

//        assertTrue(pageSource.contains("Juventus"));

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().refresh();
        driver.navigate().back();

        driver.quit(); //Quits this driver, closing every associated window.
//        driver.close(); //Close the current window, quitting the browser if it's the last window currently open.


//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.youtube.com/");

//        System.setProperty("webdriver.edge.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.youtube.com/");




    }
}
