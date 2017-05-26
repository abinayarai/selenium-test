package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class BaseTest {
  protected static WebDriver driver = null;

  @Before
  public void before() {
    System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
    driver = new ChromeDriver();
  }

  @After
  public void after() {
    driver.quit();
  }
}
