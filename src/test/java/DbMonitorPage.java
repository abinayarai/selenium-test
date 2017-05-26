package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DbMonitorPage {
  private static WebElement element = null;

  public static WebElement getClusterTitle(WebDriver driver) {
    // WebElement element = driver.findElement(By.xpath('//*[@id="clusterDetailsLeft"]/h1'));
    return element;
  }
}
