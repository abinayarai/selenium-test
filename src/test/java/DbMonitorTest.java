import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;


public class DbMonitorTest {
    public static WebDriver driver = null;

    public DbMonitorTest() {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void checkDbMonitorLink() {
    String baseUrl = System.getProperty("baseUrl");
        driver.get(baseUrl);

        WebElement dbMonitorLink = DbMonitorPage.getDbMonitorLink(driver);
        // System.out.println(dbMonitorLink.getText());

        assertEquals(DbMonitorPage.dbMonitorLinkText, dbMonitorLink.getText());
    }

    @After
    public void after() {
        driver.quit();
    }
}
