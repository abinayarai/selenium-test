package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class DbMonitorTest {
    public static WebDriver driver = null;

    public DbMonitorTest() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("driverName"));
        driver = new ChromeDriver();
    }

    @Test
    public void testAdd() {
        // WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();
        String baseUrl = System.getProperty("baseUrl");
        // driver.get("http://localhost:8080");

        // WebDriver driver = new ChromeDriver();
        //driver.get(baseUrl);

        //WebElement clusterTitle = DbMonitorPage.getClusterTitle(driver);
        driver.get("http://wwww.seleniumhq.com");

        WebElement element = driver.findElement(By.id("mainContent"));

        // System.out.println(element.getText());
        // String str = "Junit is working fine";
        // assertEquals("Junit is working fine",str);
        // System.out.println("Hello, test!");

    }

    @After
    public void after() {
    driver.quit();
  }
}
