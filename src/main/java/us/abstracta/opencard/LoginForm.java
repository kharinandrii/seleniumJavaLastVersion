package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencard.Data.LoginData;

public class LoginForm extends BaseClass {
    private By emailField = By.xpath("//*[@id='input-email']");
    private By passwordField = By.xpath("//*[@id='input-password']");
    private By loginButton = By.xpath("//*[@value='Login']");

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public LoginForm fillEmail(String email) {
        sendCaseText(emailField, email);
        return this;
    }
    public LoginForm fillPassword(String password) {
        sendCaseText(passwordField, password);
        return this;
    }

    public LoginForm clickOnButton() {
        clickOnElement(loginButton);
        return this;
    }

    public LoginForm userLogIn(LoginData loginData) {
        this.fillEmail(loginData.getEmail());
        this.fillPassword(loginData.getPassword());
        this.clickOnButton();
        return this;
    }
}
