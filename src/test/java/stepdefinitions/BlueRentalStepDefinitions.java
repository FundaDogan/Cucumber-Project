package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class BlueRentalStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    //       1. GET DATA AS LIST OF STRING
    @Given("user enters customer_email and customer_password")
    public void user_enters_customer_email_and_customer_password(DataTable credentials) {
       // List<String> customerData = credentials.row(1); // index 0 column dur.index start with 0.

//        System.out.println(customerData.get(0)); // row 1 cell 0
//        System.out.println(customerData.get(1)); // row 1 cell 1
//        System.out.println(credentials.row(1).get(0)); //2nd row 1st col
//        System.out.println(credentials.row(1).get(0)); //2nd row 2nd col

//        loginPage.username.sendKeys(customerData.get(0));
//        loginPage.password.sendKeys(customerData.get(1));
//        loginPage.loginButton.click();

        //        2. GET DATA AS <LIST<MAP<STRING,STRING>>
        List<Map<String,String>> customerData =  credentials.asMaps(String.class,String.class);
        //        System.out.println(customerData);

        for (Map<String,String> each : customerData){
            loginPage.username.sendKeys(each.get("username"));
            loginPage.password.sendKeys(each.get("password"));
            loginPage.loginButton.click();
        }
    }

    @Then("verify the application login is successful")
    public void verify_the_application_login_is_successful() {
        Assert.assertTrue(homePage.userID.isDisplayed());
    }

    @Then("verify teh login page url contains login keyword")
    public void verifyTehLoginPageUrlContainsLoginKeyword() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }
}
