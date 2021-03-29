import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void shoultRegisterSuccesfully(){
        homePage.clickSingInButton();
        registerPage.enterRegisterEmailAddress("test@mailtesting.com");
        registerPage.registerButton();
        registerPage.clickSelectTitle();
        registerPage.enterFirstName("Raul");
        registerPage.enterLastName("Test");
        registerPage.enterEmailAddrField();
        registerPage.enterPassword("123qwert");
        registerPage.clickOnNews();
        registerPage.clickOnOffers();
        registerPage.enterCompany("BobTech");
        registerPage.enterStreetAddr("str. Test nr 2");
        registerPage.enterCity("Los Angeles");
        registerPage.enterPostalCode("423124");
        registerPage.enterAdditionalInfo("Test test, aditional info.");
        registerPage.enterMobile("08812312391238");
        registerPage.enterAliasAddr("MyAddr2");

    }
}
