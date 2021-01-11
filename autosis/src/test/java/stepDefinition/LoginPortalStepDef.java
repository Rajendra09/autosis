package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.GlobalVariable;
import helper.Helper;
import pageObjects.LoginPortalPage;

public class LoginPortalStepDef {
    private LoginPortalPage loginPortalPage;

    public LoginPortalStepDef(LoginPortalPage loginPortalPage) {
        this.loginPortalPage = loginPortalPage;
    }

    @Given("^I open the autosis protal$")
    public void open_web_driver_university_web_page() {
        Helper.openBrowser();
        Helper.getWebDriver().get(GlobalVariable.APPLICATION_URL);
    }


    @When("^I sign in  with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_following_username_and_password(String userName, String password) {
        loginPortalPage.setUserName(userName);
        loginPortalPage.setpassword(password);
        loginPortalPage.ClickOnLoginButton();

    }

    @When("^Click on sign in button$")
    public void click_on_sign_in_button() {
        loginPortalPage.ClickOnLoginButton();
    }

    @Then("^i should be sign in successfully$")
    public void signin_successfully() {
        System.out.println("Loggin in successfully");

    }


}
