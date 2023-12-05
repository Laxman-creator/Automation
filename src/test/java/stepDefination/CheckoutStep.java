package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckOutPage;

public class CheckoutStep {
	
	CheckOutPage cp=new CheckOutPage();
	@When("enter first name {string} last name {string} and zipcode {string}")
	public void enter_first_name_last_name_and_zipcode(String string, String string2, String string3) {
	    cp.enterfirstname_last_name_and_zipcode(string, string2, string3);
	}

	@When("click on Continue button")
	public void click_on_continue_button() {
	   cp.clickoncontinuebutton();
	}
	
	@When("click on finish button")
	public void click_On_finish_btn() {
		cp.clickOnfinishbtn();
	}

	@Then("validate checkout text")
	public void validate_text() {
		cp.validatetext();
	}
	
	@Then("validate error message without giving zipcode")
	public void validate_error_message_without_giving_zipcode() {
		cp.validate_error_message_without_giving_zipcode();
	}
	@Then("validate error message without giving lastname")
	public void validate_error_message_without_giving_lastname() {
		cp.validate_error_message_without_giving_lastname();
	}
	@Then("validate error message without giving firstname")
	public void validate_error_message_without_giving_firstname() {
		cp.validate_error_message_without_giving_firstname();
	}
	@Then("validate error message without giving any input")
	public void validate_error_message_without_giving_anyInput() {
		cp.validate_error_message_without_giving_anyInput();
	}
	
	
	
}
	
	
	
	

