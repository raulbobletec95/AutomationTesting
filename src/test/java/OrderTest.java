import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class OrderTest extends BaseTest{

    @Test
    public void shoulMakeOrderSuccesfully(){
        homePage.clickSingInButton();
        loginPage.enterEmailAddress("test2@mailtesting.com");
        loginPage.enterPassword("123qwert");
        loginPage.singInButton();
        accountPage.clickOnWomen();
        orderPage.clickOnImage();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        orderPage.proceedToCheckout();
        orderPage.completeOrderProcess();
        orderPage.verifyOrderCompletionText();
    }
}
