package admin.positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminLoginPage;
import pages.StatisticsPage;
import utils.Browser;
import utils.CommongVerifications;

public class StatisticsPageTest {


    /**
     * Method which open the desire browser.
     */
    @BeforeMethod
    public void setUp() {
        Browser.open("chrome");

    }



    @Test
    public void testName() {
        AdminLoginPage.goTo();
        AdminLoginPage.login("admin", "parola123!");
        StatisticsPage.openStatistics();
        CommongVerifications.verifyTitle("Statistics", "You are not on the right Page!");

    }

    /**
     * Method which closes the browser.
     */
    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }


}
