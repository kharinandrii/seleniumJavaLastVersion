package us.abstracta.opencard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactForm extends BaseClass{
    public ContactForm(WebDriver driver) {
        super(driver);
    }
    By nameField = By.xpath("//*[@id ='input-name']");
    By userEmail = By.xpath("//*[@id='input-email']");
    By userTexeArea = By.xpath("//*[@id='input-enquiry']");
    By contactButton = By.xpath("//*[@value='Submit']");

    public ContactForm fillNameField() {
        String name = myMap.get("name");
        if (!getText(nameField).equals(name)) {
            sendCaseText(nameField, name);
        }
        return this;
    }

    public ContactForm fillEmailField() {
        String email = myMap.get("email");
        if (!getText(userEmail).equals(email)) {
            sendCaseText(userEmail, email);
        }
        return this;
    }
    public ContactForm fillTextArea() {
        sendCaseText(userTexeArea, "Hello, my name is " + myMap.get("name"));
        return this;
    }

    public ContactForm clickOnButton() {
        clickOnElement(contactButton);
        return this;
    }


}
