package us.abstracta.opencard;

import org.testng.annotations.Test;
import us.abstracta.opencard.Data.RegisterData;

public class RegisterUserTest extends TestBase {
    @Test
    public void test1() {
        main.openPage()
                .openMenu()
                .clickOnRegisterButton();
        safetyPage.clickOnAdvancedButton()
                .clickOnProceedLink();
        registerForm.fillRegisterForm(new RegisterData("Kherson", "730270", "220", "3487", "demo1234"));
    }
}
