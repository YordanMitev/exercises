package pages;

import org.openqa.selenium.By;
import utils.Browser;


/**
 * This Class is for the Statistics page.
 */
public class StatisticsPage {

    /**
     * This Method will open the Statistics page after you are logged in successfully.
     */
    public static void openStatistics(){
        Browser.driver.findElement(By.xpath("//a[@href='#collapse65']")).click();
        Browser.driver.findElement(By.xpath("//a[contains(text(),'Statistics')]")).click();

    }
}
