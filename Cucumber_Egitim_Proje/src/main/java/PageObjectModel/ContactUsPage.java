package PageObjectModel;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends AbstractClass {

    WebDriver driver;

    public ContactUsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title=\"Contact us\"]")
    private WebElement contactUsButton;

    public void clickContactUsButton() {
        clickElement(contactUsButton);
    }

    @FindBy(name = "id_contact")
    private WebElement subjectHeadingDropdown;

    public void selectFromDropdown() {
        selectElementFromDropdown(subjectHeadingDropdown, "Webmaster");
    }

    @FindBy(id = "email")
    private WebElement emailTextArea;

    public void typeEmail() {
        sendKeys(emailTextArea, "muraad.dag@gmail.com");
    }

    @FindBy(name = "id_order")
    private WebElement order;

    public void typeOrderReference() {
        sendKeys(order, "order123");
    }

    @FindBy(id = "message")
    private WebElement messageBox;

    public void typeMessage() {
        sendKeys(messageBox, "Ürün kırık geldi.Lütfen bana email olarak dönüş yapın Saygılarımla...");
    }

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public void clickOnSendButton() {
        clickElement(sendButton);
    }

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void assertMyMessage() {
        assertion(successMessage, "Your message has been successfully sent to our team.");
    }
    
}





















