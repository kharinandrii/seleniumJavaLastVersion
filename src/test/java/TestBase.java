import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;
    public Main main;
    public SafetyPage safetyPage;
    public RegisterForm registerForm;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        safetyPage = PageFactory.initElements(driver,SafetyPage.class);
        registerForm = PageFactory.initElements(driver, RegisterForm.class);

    }


    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
