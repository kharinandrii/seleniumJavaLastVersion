package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SafetyPage extends BaseClass{
    private By advancedButton = By.xpath("//*[@id='details-button']");
    private By proceedLink = By.xpath("//*[@id='proceed-link']");


    public SafetyPage(WebDriver driver) {
        super(driver);
    }

    public SafetyPage clickOnAdvancedButton() {
             clickOnElement(advancedButton);
        return this;
    }
    public SafetyPage clickOnProceedLink() {
            clickOnElement(proceedLink);
        return this;
    }
}
//todo если в дальнейшем не будет перебрасывать на сефти пейдж то удалить этот класс https://jeka.by/ask/165/bash-add-string-in-file/