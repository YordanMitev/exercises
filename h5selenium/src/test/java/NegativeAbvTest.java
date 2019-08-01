import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



public class NegativeAbvTest {


    private static WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.abv.bg/");

    }


    @Test
    public void testNegativeLogin() {

        

        //Wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abv-GDPR-frame")));

        driver.switchTo().frame("abv-GDPR-frame");
        driver.switchTo().frame("cmp-faktor-io");


//        driver.findElement(By.id("abv-iframe-X")).click();
//        driver.switchTo().defaultContent();


//        driver.switchTo().frame("abv-GDPR-frame");

        WebElement acceptButton = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
        acceptButton.click();
        System.out.println("dfgdfgdfgdfgdf");
        driver.switchTo().defaultContent();


        WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("samanta");

        WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("parolkamarolka");

        WebElement loginBut = driver.findElement(By.id("loginBut"));
            loginBut.click();

        String errorMessage = driver.findElement(By.id("form.errors")).getText();
        if (errorMessage.equals("Грешен потребител / парола.")) {
            System.out.println("You have been inserted incorrect credentials!");
        }




        String actualText = driver.findElement(By.id("form.errors")).getText();
        Assert.assertEquals(actualText,"Грешен потребител / парола.");


//            //Checking the right page
//            assertTrue(driver.getTitle().contains("АБВ Поща"));




//Защо локаторите не ми работят?!!

            return;
        }





    @AfterMethod
    public void tearDown() {
//        driver.close();
//        driver.quit();
    }





}
