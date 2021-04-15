package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
    WebDriver webDriver;
    public OrderPage(WebDriver driver) {
        this.webDriver = driver;
    }



    @FindBy(xpath = "//*[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement proceedCheckoutButton2;

    @FindBy(xpath = "//*[@class='button btn btn-default button-medium']")
    private WebElement proceedCheckoutButton3;

    @FindBy(xpath = "//*[@id='cgv']")
    private WebElement agreeTermsAndConditionsCheck;

    @FindBy(xpath = "//*[@class='col-xs-12 col-md-6']/p/a")
    private WebElement paymentBankWire;

    @FindBy(xpath = "//*[@class='box']/p/strong")
    private WebElement orderConfirmedText;

    public void clickOnImage(){
        Actions actions = new Actions(webDriver);
        WebElement image = webDriver.findElement(By.xpath("//*[@class='product-image-container']//a"));
        actions.moveToElement(image);

        WebElement addToCart = webDriver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']"));
        actions.moveToElement(addToCart);
        actions.click().build().perform();
    }

    public void proceedToCheckout(){
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='layer_cart_cart col-xs-12 col-md-6']/div[4]/a")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='layer_cart_cart col-xs-12 col-md-6']/div[4]/a")));
        webDriver.findElement(By.xpath("//*[@class='layer_cart_cart col-xs-12 col-md-6']/div[4]/a")).click();
    }

    public void verifyOrderCompletionText(){
        Assert.assertTrue(orderConfirmedText.getText().equals("Your order on My Store is complete."));
    }


    public void completeOrderProcess(){
        proceedCheckoutButton2.click();
        proceedCheckoutButton3.click();
        agreeTermsAndConditionsCheck.click();
        proceedCheckoutButton2.click();
        paymentBankWire.click();
        proceedCheckoutButton3.click();
    }


}
