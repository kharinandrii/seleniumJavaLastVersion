package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencard.params.HashData;
import us.abstracta.opencard.params.Params;

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
    Params params = new Params();
    HashData hashData = new HashData();

    public RegisterForm(WebDriver driver) {
        super(driver);
    }

    public RegisterForm fillFirstName() {
        String name = getRandomFirstName();
        sendCaseText(firstNameField, name);
        hashData.putValue("name", name);
        return this;
    }

    public RegisterForm fillLastName() {
        sendCaseText(lastNameField, getRandomLastName());
        return this;
    }

    public RegisterForm fillEmail() {
        String email = getRandomMail();
        sendCaseText(emailField, email);
        hashData.clearData()
                .putValue("email", email);
        return this;
    }

    public RegisterForm fillPhoneNumber() {
        sendCaseText(phoneField, getRandomPhone());
        return this;
    }

    public RegisterForm fillAddress() {
        sendCaseText(addressField, getRandomAddress());
        return this;
    }

    public RegisterForm fillCity() {
        sendCaseText(cityField, params.registerCity);
        return this;
    }

    public RegisterForm fillPostCode() {
        sendCaseText(postcodeField, params.postCode);
        return this;
    }

    public RegisterForm chooseCountry() {
        selectInDrobdown(countrySelect, params.registerCountryValue);
        return this;
    }

    public RegisterForm chooseRegion() {
        selectInDrobdown(regionSelect, params.registerRegionValue);
        return this;
    }

    public RegisterForm fillPassword() {
        sendCaseText(passwordField, params.password);
        return this;
    }

    public RegisterForm fillPasswordConfirm() {
        sendCaseText(passwordConfirmField, params.password);
        return this;
    }

    public RegisterForm checkDesebledButton() {
        elementIsDesebled(buttonRegister);
        return this;
    }

    public RegisterForm clickOnCheckbox() {
        clickOnElement(checkbox);
        elementIsSelected(checkbox);
        return this;
    }
    public RegisterForm checkEnebledButton() {
        elementIsEnebled(buttonRegister);
        return this;
    }

    public RegisterForm clickOnButton() {
        clickOnElement(buttonRegister);
        return this;
    }
}
//TODO add hashmap for save user data and check this data