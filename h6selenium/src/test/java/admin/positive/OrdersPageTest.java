package admin.positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminLoginPage;
import pages.OrdersPage;
import utils.Browser;
import utils.CommongVerifications;

public class OrdersPageTest {

    /**
     * Method which open the desire browser.
     */
    @BeforeMethod
    public void setUp() {
        Browser.open("chrome");

    }


    @Test
    public void OrdersPageTest() {
        AdminLoginPage.goTo();
        AdminLoginPage.login("admin", "parola123!");
        OrdersPage.openOrders();
        CommongVerifications.verifyTitle("Orders", "You are not on the right Page!");

    }

    /**
     * Method which closes the browser.
     */
    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }

}
