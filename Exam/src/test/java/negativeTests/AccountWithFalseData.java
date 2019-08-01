package negativeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountWithFalseData {

    private static WebDriver driver;


    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://shop.pragmatic.bg/");
    }


    @Test
    public void falseData() {


        driver.findElement(By.xpath("//span[contains(.,'My Account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

        assertTrue(driver.getTitle().contains("Register Account"));

        //Clicking the "Continue" button
        driver.findElement(By.xpath("//input[@value='Continue']")).click();


        //Master error message
        WebElement warningMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        assertEquals(warningMessage.getText(), "Warning: You must agree to the Privacy Policy!");


        //First Name error message
        WebElement warningMessageFirstName = driver.findElement(By.xpath("//fieldset[@id='account']/div[2]/div/div"));
        assertEquals(warningMessageFirstName.getText(), "First Name must be between 1 and 32 characters!");


        //Last Name error message
        WebElement warningMessageLastName = driver.findElement(By.xpath("//fieldset[@id='account']/div[3]/div/div"));
        assertEquals(warningMessageLastName.getText(), "Last Name must be between 1 and 32 characters!");


        //E-Mail error message
        WebElement warningMessageEmail = driver.findElement(By.xpath("//fieldset[@id='account']/div[4]/div/div"));
        assertEquals(warningMessageEmail.getText(), "E-Mail Address does not appear to be valid!");


        //Telephone error message
        WebElement warningMessageTelephone = driver.findElement(By.xpath("//fieldset[@id='account']/div[5]/div/div"));
        assertEquals(warningMessageTelephone.getText(), "Telephone must be between 3 and 32 characters!");

        //Password error message
        WebElement warningMessagePassword = driver.findElement(By.xpath("//div[@id='content']/form/fieldset[2]/div/div/div"));
        assertEquals(warningMessagePassword.getText(), "Password must be between 4 and 20 characters!");


    }



    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}