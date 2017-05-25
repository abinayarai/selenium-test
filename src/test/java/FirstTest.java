import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
  // private static WebDriver driver = null;
  //
  // public FirstTest() {
  //   driver = new ChromeDriver();
  // }

  @Test
  public void testAdd() {


    String str = "Junit is working fine";
    assertEquals("Junit is working fine",str);
    System.out.println("Hello, test!");
  }

  @Test
  public void testAdd1() {
    String str = "Junit is working fine";
    assertEquals("Junit is working fine",str);
    System.out.println("Hello, test!");
  }
}
