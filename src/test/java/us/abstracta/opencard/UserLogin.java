package us.abstracta.opencard;


import org.junit.jupiter.api.Test;

public class UserLogin extends TestBase{
    @Test
    public void testUserLogin() {
        main.openPage()
                .openMenu()
                .clickOnLoginButton();

    }
}
