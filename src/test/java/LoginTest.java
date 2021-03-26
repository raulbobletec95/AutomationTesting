import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void shouldSignInSuccesfuly(){
        homePage.clickSingInButton();
        loginPage.enterEmailAddress("andreea@test.com");
        loginPage.enterPassword("Andreea");
        loginPage.singInButton();
        accountPage.verifyPageTitle("My accou");
    }
}
