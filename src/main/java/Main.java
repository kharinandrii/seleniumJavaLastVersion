import org.openqa.selenium.WebDriver;

public class Main extends BaseClass{

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main openPage() {
        driver.get(BASEURL);
        return this;
    }
    ////span[text()='My Account']
    public Main openMenu() {

        return this;
    }

    public Main clickOnRegisterButton() {

        return this;
    }

}
