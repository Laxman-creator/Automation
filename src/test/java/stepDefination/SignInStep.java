package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class SignInStep {
LoginPage lp=new LoginPage();
	@When("enter valid username {string} and valid password {string}")
	public void enter_valid_username_and_valid_password(String string, String string2) {
	    lp.enter_valid_username_and_valid_password(string, string2);
	}

	@When("click on login button")
	public void click_on_login_button() {
	 lp.click_on_login_button();
	}

	@Then("validate login successfully")
	public void validate_login_successfully() {
	  lp.validate_login_successfully();
	}

}
