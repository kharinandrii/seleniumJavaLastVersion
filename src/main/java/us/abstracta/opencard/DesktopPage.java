package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesktopPage extends BaseClass {

    public DesktopPage(WebDriver driver) {
        super(driver);
    }

    By desktopTitle = By.xpath("//h2[text()='Desktops']");
    By pcCategory = By.xpath("//*[@class='col-sm-3']//*[contains(text(),'PC')]");
    By macCategory = By.xpath("//*[@class='col-sm-3']//*[contains(text(),'Mac')]");
    By cardTitle = By.xpath("//h4");

    public DesktopPage checkTitle(String text) {
        equalsText(desktopTitle, text);
        return this;
    }

    public DesktopPage openPcPage() {
        clickOnElement(pcCategory);
        return this;
    }

    public DesktopPage openMacPage() {
        clickOnElement(macCategory);
        return this;
    }
    public DesktopPage clickOnCard() {
        clickOnElement(cardTitle);
        return this;
    }
    //TODO реализовать добавление товара в корзину

}
