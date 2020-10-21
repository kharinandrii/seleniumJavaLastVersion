import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterUserTest extends TestBase{
    @Test
    public void test1() {
        main.openPage()
            .openMenu()
            .clickOnRegisterButton();
        safetyPage.clickOnAdvancedButton()
                  .clickOnProceedLink();
        registerForm.fillFirstName()
                    .fillLastName()
                    .fillEmail();
    }
}
