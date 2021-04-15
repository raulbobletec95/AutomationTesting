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
    }

    @Test
    public void signInWithWrongCredentials(){
        homePage.clickSingInButton();
        loginPage.enterEmailAddress("mail@failtest.com");
        loginPage.enterPassword("123124123");
        loginPage.singInButton();
        loginPage.checkAuthenticationError();
    }

    @Test
    public void signInWithoughtEmail(){
        homePage.clickSingInButton();
        loginPage.enterPassword(TestProperties.getPassword());
        loginPage.singInButton();
        loginPage.checkEmailError();
    }

    @Test
    public void signInWithoughtPassword(){
        homePage.clickSingInButton();
        loginPage.enterEmailAddress(TestProperties.getEmailAddress());
        loginPage.singInButton();
        loginPage.checkPasswordError();
    }
}
