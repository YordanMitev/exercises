package pages;

import org.openqa.selenium.By;
import utils.Browser;


/**
 * This Class is for the Profile page.
 */
public class ProfilePage {

    /**
     * This Method will open the Profile page after you are logged in successfully.
     */
    public static void openProfile(){
        Browser.driver.findElement(By.id("user-profile")).click();
        Browser.driver.findElement(By.xpath("//i[@class='fa fa-user-circle-o fa-fw']")).click();

    }
}
