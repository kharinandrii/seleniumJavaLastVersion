import org.openqa.selenium.WebDriver;

public class Main extends BaseClass{

    public Main(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASEURL);
    }
}
