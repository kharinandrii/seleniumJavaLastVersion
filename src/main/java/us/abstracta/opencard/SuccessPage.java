package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencard.params.Params;

public class SuccessPage extends BaseClass {
    Params params = new Params();
    By successMessageH1 = By.xpath("//h1");
    By contactLink = By.xpath("//*[text() = 'contact us']");

    public SuccessPage(WebDriver driver) {
        super(driver);
    }

    public SuccessPage checkSuccessMessage(){
        equalsText(successMessageH1, params.expectedSuccessMessage);
        return this;
    }

    public SuccessPage clickOnContactLink() {
        clickOnElement(contactLink);
        return this;
    }
}
