package us.abstracta.opencard;


import org.junit.jupiter.api.Test;

public class RegisterUserTest extends TestBase {
    @Test
    public void test1() {
        main.openPage()
                .openMenu()
                .clickOnRegisterButton();
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
                .fillTextArea()
                .clickOnButton();
        main.openPage()
                .openMenu()
                .clickOnLogout()
                .openMenu()
                .clickOnLoginButton();
        loginForm.fillEmail()
                .fillPassword("demo1234")
                .clickOnButton();
        main.moveToDesktop()
                .openDesktopPage();
        desktopPage.checkTitle(params.desktopTitleText)
                .openMacPage();
    }
}
