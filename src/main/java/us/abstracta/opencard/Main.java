package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BaseClass {
    private By myAccount = By.xpath("//span[text()='My Account']");
    private By registerButton = By.xpath("//*[text()='Register']");
    private By loginButton = By.xpath("//*[text() = 'Login']");

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main openPage() {
        driver.get(BASEURL);
        return this;
    }

    public Main openMenu() {
        isElementPresent(myAccount);
        clickOnElement(myAccount);
        return this;
    }

    public Main clickOnRegisterButton() {
        isElementPresent(registerButton);
        clickOnElement(registerButton);
        return this;
    }
    public Main clickOnLoginButton() {
        isElementPresent(loginButton);
        clickOnElement(loginButton);
        return this;
    }
}
