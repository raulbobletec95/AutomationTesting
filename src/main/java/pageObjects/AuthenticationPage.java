package pageObjects;

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
