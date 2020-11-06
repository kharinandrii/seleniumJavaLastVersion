package us.abstracta.opencard;

import org.testng.annotations.Test;

public class UserLogin extends TestBase{
    @Test
    public void testUserLogin() {
        main.openPage()
                .openMenu()
                .clickOnLoginButton();

    }
}
