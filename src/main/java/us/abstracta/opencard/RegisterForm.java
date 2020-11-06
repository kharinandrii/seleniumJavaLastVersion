package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencard.params.Params;

public class RegisterForm extends BaseClass {
    private final By firstNameField = By.xpath("//*[@id='input-firstname']");
    private final By lastNameField = By.xpath("//*[@id='input-lastname']");
    private final By emailField = By.xpath("//*[@id='input-email']");
    private final By phoneField = By.xpath("//*[@id='input-telephone']");
    private final By addressField = By.xpath("//*[@id='input-address-1']");
    private final By cityField = By.xpath("//*[@id='input-city']");
    private final By postcodeField = By.xpath("//*[@id='input-postcode']");
    private final By countrySelect = By.xpath("//*[@id='input-country']");
    private final By regionSelect = By.xpath("//*[@id='input-zone']");
    private final By passwordField = By.xpath("//*[@id='input-password']");
    private final By passwordConfirmField = By.xpath("//*[@id='input-confirm']");
    private final By checkbox = By.xpath("//*[@name='agree']");
    private final By buttonRegister = By.xpath("//*[@value='Continue']");
    Params params = new Params();


    public RegisterForm(WebDriver driver) {
        super(driver);
    }

    public RegisterForm fillFirstName() {
        String name = getRandomFirstName();
        sendCaseText(firstNameField, name);
        myMap.put("name", name);

        return this;
    }

    public RegisterForm fillLastName() {
        String lastName = getRandomLastName();
        sendCaseText(lastNameField, lastName);
        myMap.put("lastName", lastName);
        return this;
    }

    public RegisterForm fillEmail() {
        String email = myMap.get("name") + myMap.get("lastName") + "@test.tes";
        sendCaseText(emailField, email);
        myMap.put("email", email);
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