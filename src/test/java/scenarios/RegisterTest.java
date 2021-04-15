package scenarios;

import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void shoultRegisterSuccesfully(){
        homePage.clickSingInButton();
        registerPage.enterRegisterEmailAddress(registerPage.getRandomEmailOrPwd()+"@gmail.com");
        registerPage.registerButton();
        registerPage.clickSelectTitle();
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.enterEmailAddrField();
        registerPage.enterPassword(registerPage.getRandomEmailOrPwd());
        registerPage.selectDay();
        registerPage.selectMonth();
        registerPage.selectYear();
        registerPage.clickOnNews();
        registerPage.clickOnOffers();
        registerPage.enterCompany();
        registerPage.enterStreetAddr();
        registerPage.enterCity();
        registerPage.enterState();
        registerPage.enterPostalCode();
        registerPage.enterAdditionalInfo("Test test, aditional info.");
        registerPage.enterMobile();
        registerPage.enterAliasAddr();
        /*registerPage.clickRegisterButton();
        registerPage.verifyPageTitle("My account");*/

    }
}
