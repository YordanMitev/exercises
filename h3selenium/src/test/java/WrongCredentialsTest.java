import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion.*;

import java.util.concurrent.TimeUnit;

public class WrongCredentialsTest {

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
        public void testWrongCredentials () {
            WebElement username = driver.findElement(By.id("input-username"));
            driver.findElement(By.id("input-username")).sendKeys("dani");
            driver.findElement(By.id("input-password")).sendKeys("dani");
            driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

            WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
            String feedbackMesage = errorMessage.getText();
            assertEquals(feedbackMesage, "No match for Username and/or Password.\n×");


        }


        @AfterMethod
        public void tearDown () {
        driver.close();
        driver.quit();
        }

    }