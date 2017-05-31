import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;


public class BaseTest {
    protected static WebDriver driver = null;

    public void takeScreenshot(String testName, String extraName) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("screenshots/" + testName + "-" + extraName + ".png"));
    }
}
