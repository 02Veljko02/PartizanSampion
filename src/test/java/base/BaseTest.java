package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.goBack();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void goBack(){
        driver.get("https://kkpartizanshop.com/");
        homepage = new HomePage(driver);
    }
    @AfterClass
    public void turnOff(){
        driver.quit();
    }
}
