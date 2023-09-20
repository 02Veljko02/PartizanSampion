package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.ProductsPage;

public class addToCartTest extends BaseTest {
    @Test
    public void addToCartText(){
        ProductsPage productsPage = homepage.search("Fuenlabrada");
        ProductPage productPage = productsPage.clickProduct("Šal \"Fuenlabrada\" crni");
        productPage.clickAddToCart();
        Assert.assertEquals(productPage.getText(), "Šal \"Fuenlabrada\" crni", "Not expected");
    }
}
