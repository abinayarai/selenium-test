import org.junit.After;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.junit.Assert.*;

public class DbMonitorTest extends BaseTest {
    @Rule public TestName name = new TestName();

   // public static WebDriver driver = null;

    public DbMonitorTest() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("driverName"));
        driver = new ChromeDriver();
    }

    @Test
    public void checkDbMonitorLink() throws IOException {
        String baseUrl = System.getProperty("baseUrl");
        driver.get(baseUrl);

        WebElement dbMonitorLink = DbMonitorPage.getDbMonitorLink(driver);
        // System.out.println(dbMonitorLink.getText());

        assertEquals(DbMonitorPage.dbMonitorLinkText, dbMonitorLink.getText());

        takeScreenshot(name.getMethodName(), "test");
    }

    @After
    public void after() {
        driver.quit();
    }
}
