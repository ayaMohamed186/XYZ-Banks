package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.reflect.Parameter;
import pages.P01_xyzHomePage;
import pages.P02_CustomerLogin;
import pages.P03_CustomerAccount;
import util.Utility;


public class TC01_LoginWithExistUser extends TestBase{

    @Test(priority = 1 )
    public void loginWithRegisteredUser_P() throws InterruptedException {
        Thread.sleep(2000);
        new P01_xyzHomePage(driver).selectCustomerLogin();
        Thread.sleep(2000);
        String actualLoggedUserText = new P02_CustomerLogin(driver).selectUser(2);
        Thread.sleep(1000);
        new P02_CustomerLogin(driver).clickOnLogin();

        Utility.captureScreenshot(driver,"LoggedUser");

        String expectedMsgDisplay = new P03_CustomerAccount(driver).expectedLoginUserDissplay();

        Assert.assertEquals(actualLoggedUserText,expectedMsgDisplay);

    }

}
