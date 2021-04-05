package scenarios;

import org.junit.Test;
import properties.TestProperties;

import java.util.concurrent.TimeUnit;

public class OrderTest extends BaseTest{

    @Test
    public void shoulMakeOrderSuccesfully(){
        homePage.clickSingInButton();
        loginPage.enterEmailAddress(TestProperties.getEmailAddress());
        loginPage.enterPassword(TestProperties.getPassword());
        loginPage.singInButton();
        accountPage.clickOnWomen();
        orderPage.clickOnImage();
        orderPage.proceedToCheckout();
        orderPage.completeOrderProcess();
        orderPage.verifyOrderCompletionText();
    }
}
