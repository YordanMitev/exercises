import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleSelectTest {


    private static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
    }



    @Test
    public void testMutlitpleSelect() {

        Select colors = new Select(driver.findElement(By.name("color")));

        Actions builder = new Actions(driver);

        builder
                .keyDown(Keys.CONTROL)

                .click(driver.findElement(By.cssSelector("select[name='color'] option[value='rd']")))
                .click(driver.findElement(By.cssSelector("select[name='color'] option[value='sl']")))

                .keyUp(Keys.CONTROL)
                .perform();

        //proverqvame che sme selektirali 2 opcii
        assertEquals(colors.getAllSelectedOptions().size(), 2);

        //proverqvame dali sme selektirali nashite opcii
        List<String> exp_selected_options = Arrays.asList(new String[]{"Red", "Silver"});
        List<String> act_selected_options = new ArrayList<String>();


        for (WebElement option : colors.getAllSelectedOptions())
            act_selected_options.add(option.getText());

        //proverqvame izbranite s realnite dali syvpadat
        assertEquals(act_selected_options, exp_selected_options);
    }



    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
