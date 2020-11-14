package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.SamplePage;
import utilities.Hooks;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertTrue;


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
    public void iClickOnGettingStarted(){
        samplePage.clickOnGettingStarted();
    }

    @And("I click on back editor")
    public void iClickOnBackEditor() throws InterruptedException {
        samplePage.clickOnBackToEditor();
    }

//    @Then("I should see {string} on the landing page")
//    public void iShouldSeeOnTheLandingPage(String landingPage) {
//        asserThat(samplePage.isLandingDisplayed(),equalsToIgnoringCase(Login));
//        assertTrue(samplePage.isLandingDisplayed(),true);
//    }

//    @Then("I should see {string} is displayed in the output window")
//    public void iShouldSeeIsDisplayedInTheOutputWindow(String landingPageOutput) {
//        assertThat(samplePage.getLandingPageOutputText(),equals(landingPageOutput));
//    }

    @Then("I should see {string} is displayed in the landing page output")
    public void iShouldSeeIsDisplayedInTheLandingPageOutput(String landingPageOutPut) {
//        assertThat(samplePage.getLandingPageOutputText(),equalToIgnoringCase(landingPageOutPut));
//        assertThat(samplePage.isLandingPageOutputDisplayed(),equalTo(true));


        assertTrue(samplePage.isLandingPageOutputDisplayed());
        assertTrue(samplePage.getLandingPageOutputText().contentEquals(landingPageOutPut));
    }
}
