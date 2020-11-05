package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  us.abstracta.opencard.params.HashData;

public class ContactForm extends BaseClass{
    public ContactForm(WebDriver driver) {
        super(driver);
    }
    HashData hashData = new HashData();
    By nameField = By.xpath("//*[@id ='input-name']");
    By userEmail = By.xpath("//*[@id='input-email']");
    By userTexeArea = By.xpath("//*[@id='input-enquiry']");
    By contactButton = By.xpath("//*[@value='Submit']");

    public ContactForm fillNameField() {

        String name = hashData.getValue("name");
        if (!getText(nameField).equals(name)) {
            sendCaseText(nameField, name);
        }
        return this;
    }

    public ContactForm fillEmailField() {
        String email = hashData.getValue("emeil");
        sendCaseText(userEmail, email);
        return this;
    }
    public ContactForm fillTextArea(String text) {
        sendCaseText(userTexeArea, text);
        return this;
    }

    public ContactForm clickOnButton() {
        clickOnElement(contactButton);
        return this;
    }


}
