package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private By addToCart = By.className("addtocart-js");
    private By cart = By.className("tt-text");
    private By cartText = By.className("tt-title-js");
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddToCart(){
        driver.findElement(addToCart).click();
    }
    public void clickCart(){
        driver.findElement(cart).click();
    }
    public String getText(){
        this.waitForAlert();
        return driver.findElement(cartText).getText();
    }
    private void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("tt-title-js"))));
    }
}
