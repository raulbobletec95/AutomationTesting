import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AuthenticationPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.RegisterPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    public AuthenticationPage loginPage;
    public MyAccountPage accountPage;
    public RegisterPage registerPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver,HomePage.class);
        loginPage = PageFactory.initElements(driver,AuthenticationPage.class);
        accountPage= PageFactory.initElements(driver,MyAccountPage.class);
        registerPage= PageFactory.initElements(driver,RegisterPage.class);

    }

    @After
    public void quitDriver(){
//        driver.quit();
    }
}
