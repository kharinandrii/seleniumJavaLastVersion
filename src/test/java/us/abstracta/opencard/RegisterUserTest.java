package us.abstracta.opencard;

import org.testng.annotations.Test;
import us.abstracta.opencard.params.RegisterData;

public class RegisterUserTest extends TestBase {
    @Test
    public void test1() throws InterruptedException {
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
                .clickOnCheckbox()
                .clickOnButton();
        successPage.checkSuccessMessage();
    }
}
