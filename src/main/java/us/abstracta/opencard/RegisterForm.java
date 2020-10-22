package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencard.Data.RegisterData;

public class RegisterForm extends BaseClass {
    private By firstNameField = By.xpath("//*[@id='input-firstname']");
    private By lastNameField = By.xpath("//*[@id='input-lastname']");
    private By emailField = By.xpath("//*[@id='input-email']");
    private By phoneField = By.xpath("//*[@id='input-telephone']");
    private By addressField = By.xpath("//*[@id='input-address-1']");
    private By cityField = By.xpath("//*[@id='input-city']");
    private By postcodeField = By.xpath("//*[@id='input-postcode']");
    private By countrySelect = By.xpath("//*[@id='input-country']");
    private By regionSelect = By.xpath("//*[@id='input-zone']");
    private By passwordField = By.xpath("//*[@id='input-password']");
    private By passwordConfirmField = By.xpath("//*[@id='input-confirm']");
    private By checkbox = By.xpath("//*[@name='agree']");
    private By buttonRegister = By.xpath("//*[@value='Continue']");

    public RegisterForm(WebDriver driver) {
        super(driver);
    }

    public RegisterForm fillFirstName(String name) {
        sendCaseText(firstNameField, name);
        return this;
    }

    public RegisterForm fillLastName(String lastName) {
        sendCaseText(lastNameField, lastName);
        return this;
    }

    public RegisterForm fillEmail(String email) {
        sendCaseText(emailField, email);
        return this;
    }

    public RegisterForm fillPhoneNumber(String phone) {
        sendCaseText(phoneField, phone);
        return this;
    }

    public RegisterForm fillAddress(String address) {
        sendCaseText(addressField, address);
        return this;
    }

    public RegisterForm fillCity(String city) {
        sendCaseText(cityField, city);
        return this;
    }

    public RegisterForm fillPostCode(String postcode) {
        sendCaseText(postcodeField, postcode);
        return this;
    }

    public RegisterForm chooseCountry(String countyValue) {
        selectInDrobdown(countrySelect, countyValue);
        return this;
    }

    public RegisterForm chooseRegion(String regionValue) {
        selectInDrobdown(regionSelect, regionValue);
        return this;
    }

    public RegisterForm fillPassword(String password) {
        sendCaseText(passwordField, password);
        return this;
    }

    public RegisterForm fillPasswordConfirm(String password) {
        sendCaseText(passwordConfirmField, password);
        return this;
    }

    public RegisterForm clickOnCheckbox() {
        clickOnElement(checkbox);
        return this;
    }

    public RegisterForm clickOnButton() {
        clickOnElement(buttonRegister);
        return this;
    }

    public void fillRegisterForm(RegisterData registerData) {
        this.fillFirstName(getRandomFirstName());
        this.fillLastName(getRandomLastName());
        this.fillEmail(getRandomMail());
        this.fillPhoneNumber(getRandomPhone());
        this.fillAddress(getRandomAddress());
        this.fillCity(registerData.getCity());
        this.fillPostCode(registerData.getPostcode());
        this.chooseCountry(registerData.getCountry());
        this.chooseRegion(registerData.getRegion());
        this.fillPassword(registerData.getPassword());
        this.fillPasswordConfirm(registerData.getPassword());
        this.clickOnCheckbox();
        this.clickOnButton();
    }

}
//TODO add hashmap for save user data and check this data