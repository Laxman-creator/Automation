package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PDPpage;

public class PDPstep {
	PDPpage pdp=new PDPpage();
	@When("click on element name")
	public void click_on_element_name() {
		pdp.click_on_element_name();
	}
	@When("click on add to cart from pdp side")
	public void click_on_add_cart_from_pdp_side() {
		pdp.click_on_add_cart_from_pdp_side();
	}
	@Then("validate count of basket")
	public void validate_count_of_basket(){
		pdp.validate_count_of_basket();
	}

}
