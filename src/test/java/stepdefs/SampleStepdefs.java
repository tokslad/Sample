package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pageObject.SamplePage;
import utilities.Hooks;

public class SampleStepdefs {
    public WebDriver driver;
    SamplePage samplePage;

    public SampleStepdefs(Hooks hooks) {
        this.driver = hooks.getDriver();
        samplePage = new SamplePage(hooks);
    }

    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        samplePage.navigateToUrl(url);
    }

    @When("I click on getting started")
    public void iClickOnGettingStarted() {
        samplePage.clickOnGettingStarted();
    }

    @And("I click on back editor")
    public void iClickOnBackEditor() {
        samplePage.clickOnBackToEditor();
    }

//    @Then("I should see landing page")
//    public void iShouldSeeLandingPage(String landingPage){
//        Assert
//    }

    @Then("I should see {string} on the landing page")
    public void iShouldSeeOnTheLandingPage(String landingPage) {
        Assert.assertEquals(landingPage,"Log in");
    }
}
