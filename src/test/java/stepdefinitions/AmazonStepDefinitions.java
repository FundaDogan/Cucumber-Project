package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to Amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }
    @When("user search for desk")
    public void user_search_for_desk() {
      amazonPage.searchBox.sendKeys("desk"+ Keys.ENTER);

    }
    @Then("verify results contains desk")
    public void verify_results_contains_desk() {
        Assert.assertTrue(amazonPage.result.getText().contains("desk"));

    }
    @Then("close the browser")
    public void close_the_browser() {
        Driver.closeDriver();
    }
}
