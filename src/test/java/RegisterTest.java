import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void shoultRegisterSuccesfully(){
        homePage.clickSingInButton();
        registerPage.enterRegisterEmailAddress("test2@mailtesting.com");
        registerPage.registerButton();
        registerPage.clickSelectTitle();
        registerPage.enterFirstName("Rauul");
        registerPage.enterLastName("Testt");
        registerPage.enterEmailAddrField();
        registerPage.enterPassword("123qwert");
        registerPage.selectDay();
        registerPage.selectMonth();
        registerPage.selectYear();
        registerPage.clickOnNews();
        registerPage.clickOnOffers();
        registerPage.enterCompany("BobTech");
        registerPage.enterStreetAddr("str. Test nr 2");
        registerPage.enterCity("Los Angeles");
        registerPage.enterState();
        registerPage.enterPostalCode("98765");
        registerPage.enterAdditionalInfo("Test test, aditional info.");
        registerPage.enterMobile("08812312391238");
        registerPage.enterAliasAddr("MyAddr2");
        registerPage.clickRegisterButton();
        registerPage.verifyPageTitle("My account");

    }
}
