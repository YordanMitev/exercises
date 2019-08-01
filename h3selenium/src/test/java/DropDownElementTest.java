import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DropDownElementTest {


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
        driver.findElement(By.xpath("//a[@href='#collapse26']")).click();
        driver.findElement(By.xpath("//ul[contains(@id,'collapse26')]/li[1]/a")).click();

        WebElement dropDown = driver.findElement(By.xpath("//select[contains(@name,'filter_order_status_id')]"));
//        WebElement dropDown = driver.findElement(By.name("filter_order_status_id"));


        Select otherStatus = new Select(dropDown);
        assertFalse(otherStatus.isMultiple());
        assertEquals(otherStatus.getOptions().size(), 16);

        List<String> expected_options = Arrays.asList(new String[]{"", "Missing Orders", "Canceled",
                "Canceled Reversal", "Chargeback", "Complete", "Denied", "Expired", "Failed",
                "Pending", "Processed", "Processing", "Refunded", "Reversed", "Shipped", "Voided"});

        List<String> actual_options = new ArrayList<String>();

        List<WebElement> allOptions = otherStatus.getOptions();
        for (WebElement option : allOptions) {
            actual_options.add(option.getText());
        }

        assertEquals(actual_options.toArray(), expected_options.toArray());

        otherStatus.selectByVisibleText("");
        assertEquals(otherStatus.getFirstSelectedOption().getText(), "");


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
