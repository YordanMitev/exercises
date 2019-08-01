package pages;

import org.openqa.selenium.By;
import utils.Browser;

/**
 * This Class is for the Orders page.
 */
public class OrdersPage {

    /**
     * This Method will open the Orders page after you are logged in successfully.
     */
    public static void openOrders(){
        Browser.driver.findElement(By.xpath("//a[@href='#collapse26']")).click();
        Browser.driver.findElement(By.xpath("//ul[contains(@id,'collapse26')]/li[1]/a")).click();

    }
}

