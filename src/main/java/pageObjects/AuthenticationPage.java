package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {
    WebDriver webDriver;
    public AuthenticationPage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement singInButton;

    // //*[@class='alert alert-danger']/p
    // //*[@class='alert alert-danger']//li

    @FindBy(xpath = "//*[@class='alert alert-danger']//li")
    private WebElement textError;

    public void checkEmailError(){
        Assert.assertTrue(textError.getText().equals("An email address required."));
    }

    public void checkPasswordError(){
        Assert.assertTrue(textError.getText().equals("Password is required."));
    }

    public void checkAuthenticationError(){
        Assert.assertTrue(textError.getText().equals("Authentication failed."));
    }

    public void enterEmailAddress(String expectedEmail){
        emailField.sendKeys(expectedEmail);
    }

    public void enterPassword(String expectedPassword){
        passwordField.sendKeys(expectedPassword);
    }

    public void singInButton(){
        singInButton.click();
    }
}
