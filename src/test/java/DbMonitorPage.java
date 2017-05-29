import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DbMonitorPage {
    private static WebElement element = null;

    public static String dbMonitorLinkText = "DB Monitor";

    public static WebElement getDbMonitorLink(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//*[@id='navDbmonitor']/a"));
        return element;
    }
}
