package us.abstracta.opencard;

import org.testng.annotations.Test;
import us.abstracta.opencard.params.LoginData;

public class UserLogin extends TestBase{
    @Test
    public void testUserLogin() {
        main.openPage()
                .openMenu()
                .clickOnLoginButton();
        loginForm.userLogIn(new LoginData("admin", "demo1234"));
    }
}
