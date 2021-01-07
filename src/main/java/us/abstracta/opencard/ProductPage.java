package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BaseClass {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By addToCart = By.xpath("button-cart");

    public ProductPage clickOnAddToCart() {
        clickOnElement(addToCart);
        return this;
    }
}
