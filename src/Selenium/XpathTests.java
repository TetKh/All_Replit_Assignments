package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathTests {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("os.name").contains("Windows") ? "drivers/chromedriver.exe" : "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers_8a080d3d7b55497ea1bdd97b7cff8b7b']")).click();
        System.out.println(driver.findElement(By.xpath("//div[.='Amazon Best Sellers'][@id='zg_banner_text_wrapper']")).getTagName());
        System.out.println(driver.findElement(By.xpath("//div[.='Amazon Best Sellers'][@id='zg_banner_text_wrapper']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[.='Amazon Best Sellers'][@id='zg_banner_text_wrapper']")).getSize());
        System.out.println(driver.findElement(By.xpath("//div[.='Amazon Best Sellers'][@id='zg_banner_text_wrapper']")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//div[.='Amazon Best Sellers'][@id='zg_banner_text_wrapper']")).getCssValue("font-family"));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.chord(Keys.SHIFT, "laprop BAGS", Keys.ENTER));
        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='p13n-sc-truncated']"));
        System.out.println(listOfElements.size());

        for (WebElement element: listOfElements) {
            System.out.println(element.getTagName());
        }


        driver.quit();




    }
}
