package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class HomePage{
     private WebDriver driver;
     private By cart = By.className("tt-text");
     private By searchField = By.xpath("/html/body/div[4]/header/div[2]/div[2]/div/div[2]/div/form/input[2]");

     public HomePage(WebDriver driver) {
          this.driver = driver;
     }
     public void clickCart(){
          driver.findElement(cart).click();
     }
     public ProductsPage search(String searchProduct){
          driver.findElement(searchField).sendKeys(searchProduct, Keys.ENTER);
          return new ProductsPage(driver);
     }

}
