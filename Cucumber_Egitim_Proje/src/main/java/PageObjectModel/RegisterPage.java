package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage extends AbstractClass {
    private WebDriver driver;

    public RegisterPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(name = "email_create")
    private WebElement emailTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(name = "passwd")
    private WebElement password;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(name = "address1")
    private WebElement address;

    public void clickOnSignİnButton() {
        clickElement(signInButton);
    }

    public void typeEmail(String email) {
        sendKeys(emailTextBox, email);
    }

    public void clickOnSubmitButton() {
        clickElement(submitButton);
    }

    public void clickOnGender() {
        clickElement(gender);
    }

    public void typeFirstNameAndLastName(String firstName, String lastName) {
        sendKeys(firstname, firstName);
        sendKeys(lastname, lastName);
    }

    public void typePassword(String password) {
        sendKeys(this.password, password);
    }

    public void typeCompany(String company) {
        sendKeys(this.company, company);
    }

    public void typeAddress(String address) {
        sendKeys(this.address, address);
    }

}
