package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
    WebDriver webDriver;
    public MyAccountPage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(xpath = "//*[@class='page-heading']")
    private WebElement pageTitle;

    public void verifyPageTitle(String expectedTitle){
       Assert.assertTrue("Expected title wasn't found",expectedTitle.equalsIgnoreCase(pageTitle.getText()));
    }
}

