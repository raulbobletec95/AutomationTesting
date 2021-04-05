package scenarios;

import org.junit.Test;
import properties.TestProperties;

public class LoginTest extends BaseTest{
    @Test
    public void shouldSignInSuccesfuly(){
        homePage.clickSingInButton();
        loginPage.enterEmailAddress(TestProperties.getEmailAddress());
        loginPage.enterPassword(TestProperties.getPassword());
        loginPage.singInButton();
        accountPage.verifyPageTitle(TestProperties.getAccountTitleText());
        //loginPage.checkEmailError();
        //loginPage.checkPasswordError();
        //loginPage.checkAuthenticationError();
    }
}
