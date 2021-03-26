package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    WebDriver webDriver;
    public HomePage(WebDriver driver) {
        this.webDriver = driver;
        this.webDriver.get("http://automationpractice.com/index.php");
    }

    @FindBy(xpath = "//*[@class='login']")
    private WebElement signInButton;

    public void clickSingInButton(){
        signInButton.click();
    }

}
