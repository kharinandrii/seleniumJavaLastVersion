import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterForm extends BaseClass {
    private By firstNameField = By.xpath("//*[@id='input-firstname']");
    private By lastNameField = By.xpath("//*[@id='input-lastname']");
    private By emailField = By.xpath("//*[@id='input-email']");

    public RegisterForm(WebDriver driver) {
        super(driver);
    }

    public RegisterForm fillFirstName() {
        sendCaseText(firstNameField,getRandomFirstName());
        return this;
    }
    public RegisterForm fillLastName() {
        sendCaseText(lastNameField,  getRandomLastName());
        return this;
    }
    public RegisterForm fillEmail() {
        sendCaseText(emailField, getRandomMail());
        return this;
    }
}
//TODO add hashmap for save user data and check this data