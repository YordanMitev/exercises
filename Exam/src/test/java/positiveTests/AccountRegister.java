package positiveTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class AccountRegister {


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
    public void rightAccount() {


        driver.findElement(By.xpath("//span[contains(.,'My Account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

        assertTrue(driver.getTitle().contains("Register Account"));

        //First Name
        driver.findElement(By.id("input-firstname")).sendKeys("Yordan");

        //Last Name
        driver.findElement(By.id("input-lastname")).sendKeys("Mitev");

        //E-Mail
        driver.findElement(By.id("input-email")).sendKeys("masterfu@mail.ru");

        //Telephone
        driver.findElement(By.id("input-telephone")).sendKeys("0888123456");


        //Password (first time)
        driver.findElement(By.id("input-password")).sendKeys("0581asdf");

        //Password (second time)
        driver.findElement(By.id("input-confirm")).sendKeys("0581asdf");

        //Radio button
        WebElement subscribeButton = driver.findElement(By.name("newsletter"));


        if (!subscribeButton.isSelected())
            subscribeButton.click();

        assertTrue(subscribeButton.isSelected());


        //Check box for Privacy Policy
        WebElement policyCheckBox = driver.findElement(By.name("agree"));

        if (!policyCheckBox.isSelected())
            policyCheckBox.click();

        assertTrue(policyCheckBox.isSelected());

        //Clicking the "Continue" button
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        assertTrue(driver.getTitle().contains("Your Account Has Been Created!"));


    }



    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
