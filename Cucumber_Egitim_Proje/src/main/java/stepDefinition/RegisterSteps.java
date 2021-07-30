package stepDefinition;

import PageObjectModel.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();
    private WebDriver driver;

    @Given("Navigate to Website")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        registerPage.goToUrl("http://automationpractice.com/index.php");
    }

    @And("click Sign in button")
    public void clickSignInButton() {
        registerPage.clickOnSignİnButton();
    }

    @And("type email {string}")
    public void typeEmail(String email) {
        registerPage.typeEmail(email);
    }

    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
        registerPage.clickOnSubmitButton();
    }

    @And("choose title")
    public void chooseTitle() {
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstName, String lastName) {
        registerPage.typeFirstNameAndLastName(firstName, lastName);
    }

    @And("type password {string}")
    public void typePassword(String password) {
        registerPage.typePassword(password);
    }

    @And("type Company {string}")
    public void typeCompany(String company) {
        registerPage.typeCompany(company);
    }

    @And("type address {string}")
    public void typeAddress(String address) {
        registerPage.typeAddress(address);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
