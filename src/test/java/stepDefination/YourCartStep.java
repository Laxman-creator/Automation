package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.YourCartPage;

public class YourCartStep  {

	YourCartPage yp=new YourCartPage();
	@When("remove one item from basket")
	public void remove_item() throws InterruptedException {
		yp.remove_item();
		
	}
	@Then("validate remove button functionality")
	public void validate_remove_button_functionality() {
	   yp.validate_remove_button_functionality();
	}
}
