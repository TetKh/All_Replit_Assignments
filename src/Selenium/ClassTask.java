package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ClassTask {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\parvi\\Desktop\\Duotech\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();


        wd.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        wd.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);
        Thread.sleep(2000);

        try {
            assertTrue(wd.getTitle().contains(("Web Orders")));
        } catch (AssertionError ae) {
            ae.printStackTrace();
        }

        wd.getPageSource().contains("Welcome, Tester!");
        wd.getPageSource().contains("List of All Orders");

        List<WebElement> links = wd.findElements(By.tagName("a"));
        assertEquals(links.size(), 6);

        List<String> actualList = new ArrayList<>();
        List<String> expectedList = new ArrayList(Arrays.asList("View all orders", "View all products", "Order", "Logout", "Check All", "Uncheck All"));

        for (WebElement link : links) {
            System.out.println(link.getText());
            actualList.add(link.getText());
        }

        assertEquals(actualList, expectedList);

        wd.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(2000);
        try {
            assertEquals(wd.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        }catch (AssertionError ae){
            ae.printStackTrace();
        }

        wd.quit();

    }
}
