import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BaseClass{
    private By myAccount = By.xpath("//span[text()='My Account']");
    private By registerButton = By.xpath("//*[text()='Register']");

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main openPage() {
        driver.get(BASEURL);
        return this;
    }

    public Main openMenu() {
        isElementPresent(myAccount);
        clickOnElement(myAccount);
        return this;
    }

    public Main clickOnRegisterButton() {
        isElementPresent(registerButton);
        clickOnElement(registerButton);
        return this;
    }

}
