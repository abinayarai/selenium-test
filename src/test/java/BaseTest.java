package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


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
