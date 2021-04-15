package pageObjects;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegisterPage {
    WebDriver webDriver;
    Faker faker = new Faker();

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

    @FindBy(id = "submitAccount")
    private WebElement registerSubmitButton;

    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;

    public void verifyPageTitle(String expectedTitle) {
        Assert.assertTrue("Expected title wasn't found", expectedTitle.equalsIgnoreCase(pageTitle.getText()));
    }

    public void enterRegisterEmailAddress(String expectedEmail) {
        emailRegisterField.sendKeys(expectedEmail);
    }

    public void registerButton() {
        registerButton.click();
    }

    public void clickSelectTitle() {
        selectTitle.click();
    }

    public void enterFirstName() {
        personalFirstNameField.sendKeys(faker.name().firstName());
    }

    public void enterLastName() {
        personalLastNameField.sendKeys(faker.name().lastName());
    }

    public void enterEmailAddrField() {
        emailCreateField.click();
    }

    public void enterPassword(String expectedPassword) {
        passwordField.sendKeys(expectedPassword);
    }

    public void selectDay() {
        Select daysDropDown = new Select(webDriver.findElement(By.id("days")));
        daysDropDown.selectByIndex(2);
    }

    public void selectMonth() {
        Select monthDropDown = new Select(webDriver.findElement(By.id("months")));
        monthDropDown.selectByIndex(5);
    }

    public void selectYear() {
        Select yearDropDown = new Select(webDriver.findElement(By.id("years")));
        yearDropDown.selectByIndex(5);
    }

    public void clickOnNews() {
        newsLetter.click();
    }

    public void clickOnOffers() {
        specialOffers.click();
    }

    public void enterCompany() {
        companyAddr.sendKeys(faker.company().name());
    }

    public void enterStreetAddr() {
        streetAddress.sendKeys(faker.address().streetAddress());
    }

    public void enterCity() {
        selectCity.sendKeys(faker.address().city());
    }

    public void enterState() {
        Select stateDropDown = new Select(webDriver.findElement(By.id("id_state")));
        stateDropDown.selectByIndex(4);
    }

    public void enterPostalCode() {
        postalCode.sendKeys(faker.address().zipCode());
    }

    public void enterAdditionalInfo(String expectedAdditionalInfo) {
        additionalInfo.sendKeys(expectedAdditionalInfo);
    }

    public void enterMobile() {
        mobilePhone.sendKeys(faker.number().digits(9));
    }

    public void enterAliasAddr() {
        addressAlias.sendKeys(faker.address().streetPrefix());
    }

    public void clickRegisterButton() {
        registerSubmitButton.click();
    }

    public String getRandomEmailOrPwd() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public String getRandomName() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }


}
