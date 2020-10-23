package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;
import org.testng.Assert;


import java.util.Locale;

import static org.testng.Assert.assertTrue;


public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    protected String BASEURL = "http://opencart.abstracta.us/";
    final Faker faker = new Faker(new Locale("en"));

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
        driver.findElement(elementBy).sendKeys(text);
    }

    public void isElementPresent(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
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

    public String getRandomMail() {
        return  faker.animal().name() + "@test.uk";
    }

    public String getRandomPhone() {
        return  faker.number().digits(8);
    }

    public String getRandomAddress() {

        return faker.address().streetAddress();
    }

    public void elementIsSelected(By elementBy) {
        Assert.assertTrue(driver.findElement(elementBy).isSelected());
    }

    public void equalsText(By elementBy, String expectedText) {
        String actualText = driver.findElement(elementBy).getText();
        Assert.assertEquals(actualText, expectedText);
    }

}



//TODO watch selenium-real-time-examplesinterview-questions/08 Selenium Webdriver-Techniques to automate Web elements
// ->
