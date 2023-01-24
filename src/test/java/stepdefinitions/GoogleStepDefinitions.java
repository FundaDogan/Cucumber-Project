package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        //write the java code
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @When("user search for Iphone")
    public void user_search_for_iphone() {
        googlePage.searchBox.sendKeys("iphone"+ Keys.ENTER);

    }
    @Then("verify page title contains Iphone")
    public void verify_page_title_contains_iphone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }

    @Then("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }

    @When("user search for Teapot")
    public void user_search_for_teapot() {
        googlePage.searchBox.sendKeys("Teapot"+ Keys.ENTER);

    }
    @Then("verify page title contains Teapot")
    public void verify_page_title_contains_teapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Teapot"));
    }

    @When("user search for {string} on google")
    public void user_search_for_on_google(String string) {
        googlePage.searchBox.sendKeys(string+Keys.ENTER);

    }

    @Then("verify page title contains {string}")
    public void verify_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}
