
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class RightCredentialsTest {


    private static WebDriver driver;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://shop.pragmatic.bg/admin/");
    }


    @Test
    public void testRightCredentials() {

        WebElement username = driver.findElement(By.id("input-username"));
//        driver.findElement(By.id("input-username")).click();
        driver.findElement(By.id("input-username")).sendKeys("admin");
        driver.findElement(By.id("input-password")).sendKeys("parola123!");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        WebElement checkingLogin = driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']"));
        String chekingButton = checkingLogin.getText();
        assertEquals(chekingButton, "Logout");

        driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md']")).click();

    }


    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
