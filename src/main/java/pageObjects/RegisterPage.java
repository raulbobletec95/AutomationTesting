package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver webDriver;
    public RegisterPage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(xpath = "//*[@id='email_create']")
    private WebElement emailRegisterField;

    @FindBy(id = "SubmitCreate")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='id_gender1']")
    private WebElement selectTitle;

    @FindBy(id = "customer_firstname")
    private WebElement personalFirstNameField;

    @FindBy(id = "customer_lastname")
    private WebElement personalLastNameField;

    @FindBy(id = "email")
    private WebElement emailCreateField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

//    Select daysDropDown = new Select(webDriver.findElement(By.id("days")));

    @FindBy(id = "newsletter")
    private WebElement newsLetter;

    @FindBy(id = "optin")
    private WebElement specialOffers;

    @FindBy(id = "company")
    private WebElement companyAddr;

    @FindBy(id = "address1")
    private WebElement streetAddress;

    @FindBy(id = "city")
    private WebElement selectCity;

    @FindBy(id = "postcode")
    private WebElement postalCode;

    @FindBy(id = "other")
    private WebElement additionalInfo;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;

    @FindBy(id = "alias")
    private WebElement addressAlias;

    public void enterRegisterEmailAddress(String expectedEmail){
        emailRegisterField.sendKeys(expectedEmail);
    }

    public void registerButton(){
        registerButton.click();
    }

    public void clickSelectTitle(){
        selectTitle.click();
    }

    public void enterFirstName(String expectedFirstName){
        personalFirstNameField.sendKeys(expectedFirstName);
    }

    public void enterLastName(String expectedLastName){
        personalLastNameField.sendKeys(expectedLastName);
    }

    public void enterEmailAddrField(){
        emailCreateField.click();
    }

    public void enterPassword(String expectedPassword){
        passwordField.sendKeys(expectedPassword);
    }

    public void selectDay(){
  //      daysDropDown.selectByIndex(2);
    }

    public void clickOnNews(){
        newsLetter.click();
    }

    public void clickOnOffers(){
        specialOffers.click();
    }

    public void enterCompany(String expectedCompany){
        companyAddr.sendKeys(expectedCompany);
    }

    public void enterStreetAddr(String expectedAddr){
        streetAddress.sendKeys(expectedAddr);
    }

    public void enterCity(String expectedCity){
        selectCity.sendKeys(expectedCity);
    }

    public void enterPostalCode(String expectedPostalCode){
        postalCode.sendKeys(expectedPostalCode);
    }

    public void enterAdditionalInfo(String expectedAdditionalInfo){
        additionalInfo.sendKeys(expectedAdditionalInfo);
    }

    public void enterMobile(String expectedMobile){
        mobilePhone.sendKeys(expectedMobile);
    }

    public void enterAliasAddr(String expectedAlias){
        addressAlias.sendKeys(expectedAlias);
    }
}
