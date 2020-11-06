package us.abstracta.opencard;

import org.testng.annotations.Test;

public class RegisterUserTest extends TestBase {
    @Test
    public void test1() {
        main.openPage()
                .openMenu()
                .clickOnRegisterButton();
        safetyPage.clickOnAdvancedButton()
                .clickOnProceedLink();
        registerForm.fillFirstName()
                .fillLastName()
                .fillEmail()
                .fillPhoneNumber()
                .fillAddress()
                .fillCity()
                .fillPostCode()
                .chooseCountry()
                .chooseRegion()
                .fillPassword()
                .fillPasswordConfirm()
                .checkDesebledButton()
                .clickOnCheckbox()
                .checkEnebledButton()
                .clickOnButton();
        successPage.checkSuccessMessage()
                .clickOnContactLink();
        contactForm.fillNameField()
                .fillEmailField()
                .fillTextArea("hello world")
                .clickOnButton();
        main.openPage()
                .openMenu()
                .clickOnLogout()
                .openMenu()
                .clickOnLoginButton();
        loginForm.fillEmail()
                .fillPassword("demo1234")
                .clickOnButton();
    }
}
