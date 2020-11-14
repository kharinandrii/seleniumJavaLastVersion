package us.abstracta.opencard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import us.abstracta.opencard.params.Params;


import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;
    public Main main;
    public SafetyPage safetyPage;
    public RegisterForm registerForm;
    public LoginForm loginForm;
    public Params params;
    public SuccessPage successPage;
    public  ContactForm contactForm;


    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        safetyPage = PageFactory.initElements(driver, SafetyPage.class);
        registerForm = PageFactory.initElements(driver, RegisterForm.class);
        loginForm = PageFactory.initElements(driver, LoginForm.class);
        params = PageFactory.initElements(driver, Params.class);
        successPage = PageFactory.initElements(driver, SuccessPage.class);
        contactForm = PageFactory.initElements(driver, ContactForm.class);
    }


    @AfterEach
    public void closeDriver() {
        driver.quit();
    }
}
