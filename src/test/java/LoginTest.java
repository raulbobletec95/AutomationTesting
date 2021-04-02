import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void shouldSignInSuccesfuly(){
        homePage.clickSingInButton();
        loginPage.enterEmailAddress("andreeasassdasa@test.com");
        loginPage.enterPassword("Andreeeeeea");
        loginPage.singInButton();
        //accountPage.verifyPageTitle("My account");
        //loginPage.checkEmailError();
        //loginPage.checkPasswordError();
        loginPage.checkAuthenticationError();
    }
}
