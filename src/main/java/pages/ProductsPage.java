package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage clickProduct(String productName){
        driver.findElement(By.linkText(productName)).click();
        return new ProductPage(driver);
    }

}
