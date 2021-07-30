package stepDefinition;

import PageObjectModel.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import utilities.Driver;

public class ContactUsSteps {

    private WebDriver driver;
    ContactUsPage contactUsPage= new ContactUsPage();

    @Given("navigate to Website")
    public void navigateToWebsite() throws InterruptedException {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        contactUsPage.goToUrl("http://automationpractice.com/index.php");
    }

    @And("click on contact us button")
    public void clickOnContactUsButton() {
        contactUsPage.clickContactUsButton();
    }

    @And("select Subject Heading")
    public void selectSubjectHeading() {
        contactUsPage.selectFromDropdown();
    }

    @And("type Email")
    public void typeEmail() {
        contactUsPage.typeEmail();
    }

    @And("type Order reference")
    public void typeOrderReference() {
        contactUsPage.typeOrderReference();
    }

    @And("type a message")
    public void typeAMessage() {
        contactUsPage.typeMessage();
    }

    @When("click on submit button")
    public void clickOnSubmitButton() {
        contactUsPage.clickOnSendButton();
    }

    @Then("verify success message")
    public void verifySuccessMessage() {
        contactUsPage.assertMyMessage();
    }

    @And("quit Driver")
    public void tearDown(){
        driver.quit();
    }
}
