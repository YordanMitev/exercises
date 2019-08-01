import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFIrstTest {

    @BeforeMethod
    public void setUp() {
//        Next line will test system variable
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\Chrome 74.0.3729.6\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }

    
    @Test
    public void firstTest() {
        System.out.println("BLAAAAAAAA");
    }
}
