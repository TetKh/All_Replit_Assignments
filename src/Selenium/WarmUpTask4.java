package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WarmUpTask4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("os.name").contains("Windows") ? "drivers/chromedriver.exe" : "drivers/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.get("https://www.bloomberg.com/markets/stocks");
        wd.manage().deleteAllCookies();
        List<String> actual = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.xpath("//div[@data-view-uid='1|0_3_3']//tr[@class='data-table-headers']"));
        for (WebElement element : elements){
            actual.add(element.getText());
        }
        List<String> expected = Arrays.asList("NAME", "VALUE", "NET", "CHANGE", " % CHANGE", "1 MONTH", "1 YEAR", "TIME (EDT)");
//        Assert.assertEquals(actual, expected);
        System.out.println(actual);
        System.out.println(expected);

        wd.quit();

    }
}
