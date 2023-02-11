package stepdefinitions;

import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ReusableMethods;

public class MedunnaSignInStepDefs {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

    @When("user click on user icon")
    public void user_click_on_user_icon() {
        ReusableMethods.waitFor(1);
        medunnaHomePage.userIcon.click();
    }

    @When("user click on Signin option")
    public void user_click_on_signin_option() {

        medunnaHomePage.signInOption.click();
    }

    @When("enter {string} in Username input")
    public void enter_in_username_input(String username) {

        medunnaLoginPage.usernameInput.sendKeys(username);
    }
    @When("enter {string} in Password input")
    public void enter_in_password_input(String password) {

        medunnaLoginPage.passwordInput.sendKeys(password);
    }

    @When("click on Remember Me checkbox")
    public void click_on_remember_me_checkbox() {

        medunnaLoginPage.rememberMeCheckbox.click();
    }

    @When("click on Sign in button")
    public void click_on_sign_in_button() {

        medunnaLoginPage.signInSubmitButton.click();

    }
}
