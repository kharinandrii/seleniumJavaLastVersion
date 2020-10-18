import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;


import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    protected String BASEURL = "http://opencart.abstracta.us/";
    final Faker faker = new Faker(new Locale("en"));
    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait =  new WebDriverWait(driver, 15);
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
    public String getRandomFirstName() {
        String firstName;
        return firstName =faker.name().firstName();
    }
    public String getRandomLastName() {
        String lastName;
        return lastName = faker.name().lastName();
    }
    public String getRandomMail() {
        String email;
        return email = faker.funnyName() + "@test.uk";
    }
}

