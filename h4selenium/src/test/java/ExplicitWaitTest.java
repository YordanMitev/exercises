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

public class ExplicitWaitTest {


    private static WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.foodpanda.bg/");
    }

        @Test
        public void testExplicitWait(){
            WebElement searchBar = driver.findElement
                    (By.xpath("//input[@class='restaurants-search-form__input restaurants__location__input ']"));
            driver.findElement(By.xpath("//a[@data-locale='bg']")).click();
            driver.findElement
                    (By.xpath("//input[@class='restaurants-search-form__input restaurants__location__input ']"))
                    .sendKeys("Starbucks The Mall");
            driver.findElement(By.xpath("//div[@class='button-container ']")).click();


            //Moqt ekspleciten wait
                    WebDriverWait wait = new WebDriverWait(driver, 10);
//                    wait.until(ExpectedConditions.titleContains("Поръчай храна онлайн с бърза доставка до дома или офиса | foodpanda"));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='name fn']")));


                    //Perfect locator from Georgi with findElementS, and here we will find our restaurant
                    List<WebElement> allRestaurantNames = driver.findElements(By.xpath("//span[@class='name fn']"));
                    for (WebElement myRestaurant : allRestaurantNames) {

                        //left the print below only for log purposes in the console log :)
                        System.out.println(myRestaurant.getText());
                        if (myRestaurant.getText().equals("Starbucks (The Mall)")){
                            myRestaurant.click();

                    System.out.println("You have been selected successfully a restaurant!");

                    //Checking the right page
                    assertTrue(driver.getTitle().contains("Менюто на Starbucks (The Mall) в Sofia| Доставка на храна в България | фоодпанда"));


                //returning out of a void method, which will stop the test execution and mark the test as passed.
                return;
            }

        }


            //Tuk iskah da izprobvam ne]o i ne maham narochno koda


////            Here I will check my restaurant it is correct.
//            WebElement checkingRestaurant = driver.findElement(By.xpath("//h3[@class='desktop-cart__title']/span"));
//            String nameOfRestaurant = checkingRestaurant.getText();
//
////            Primer
//            Assert.assertEquals(nameOfRestaurant, "rrrrrrrrrrrrrrrrrrrrrrrr");
//
//
//            //Verify Title
//            assertTrue(driver.getTitle().toLowerCase().startsWith("ghfghdhfdfgh"));
////            assertTrue(nameOfRestaurant.get.contains("Nunc nibh tortor"));


        }



    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }


    }

