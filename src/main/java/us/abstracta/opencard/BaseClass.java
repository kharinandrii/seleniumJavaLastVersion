package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Locale;




public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;

    protected String BASEURL = "http://opencart.abstracta.us/";
    final Faker faker = new Faker(new Locale("en"));
    public static HashMap<String, String> myMap = new HashMap<String, String>();

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);

    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void clickOnElement(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();

    }

    public void sendCaseText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public void isElementPresent(By elementBy) {
        waitVisibility(elementBy);
        assert (driver.findElement(elementBy).isDisplayed());
    }

    public void selectInDrobdown(By elementBy, String value) {
        Select dropdown = new Select(driver.findElement(elementBy));
        dropdown.selectByValue(value);
    }

    public String getRandomFirstName() {

        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return  faker.name().lastName();
    }

    public String getRandomPhone() {
        return  faker.number().digits(8);
    }

    public String getRandomAddress() {
        return faker.address().streetAddress();
    }

    public void elementIsSelected(By elementBy) {
        assertTrue(driver.findElement(elementBy).isSelected());
    }

    public void equalsText(By elementBy, String expectedText) {
        String actualText = driver.findElement(elementBy).getText();
        assertEquals(actualText, expectedText);
    }

    public void elementIsEnebled(By elementBy) {
        assertTrue(driver.findElement(elementBy).isEnabled());
    }

    public void elementIsDesebled(By elementBy) {
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    public String getText(By elementBy) {
        return  driver.findElement(elementBy).getText();
    }

    public  void moveMouseToElement(By elementBy) {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(elementBy)).click().build().perform();
    }

}

//todo дописать тест добавив проверку массива єлементов и после єтого добавить товар в корзину для DesktopPage.class

//TODO watch https://www.youtube.com/watch?v=FRn5J31eAMw
//TODO добавить jankins в проект