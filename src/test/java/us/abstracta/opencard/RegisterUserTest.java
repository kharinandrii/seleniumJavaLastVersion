package us.abstracta.opencard;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class RegisterUserTest extends TestBase {
    @Epic("Testing opencard website")
    @Feature("testing user register and login functions")
    @Story(value = "user create new aacount and login in system")
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
                .openMacPage()
                .clickOnCard();
    }

    @Feature("testing user login functions with correct data")
    @Story(value = "user create new acount and login in system")
    @Test
    public void testUserLogin() {
        main.openPage()
                .openMenu()
                .clickOnLoginButton();
        loginForm.fillEmail()
                .fillPassword("demo1234")
                .clickOnButton();
    }
}
