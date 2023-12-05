package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ProductPage;

public class ProductStep {
	
ProductPage pp=new ProductPage();
@When("click on add to cart")
public void click_on_add_to_cart() {
   pp.click_on_add_to_cart();
}

@When("click on basket")
public void click_on_basket() throws InterruptedException {
   pp.click_on_basket();
}
@When("click on checkout")
public void click_on_checkout() throws InterruptedException{
   pp.clickOnCheckout();
}
@When("click on filter dropdown")
public void click_on_filter_dropdown() {
	pp.click_on_filter_dropdown();
}
@When("Add two item on basket")
public void add_two_item_on_basket() {
	pp.add_two_item_on_basket();
}
@Then("validate text")
public void validate_checkout_text(){
  pp.ValidateText();
}
@Then("validate count of item")
public void validate_countOfItem() {
	pp.validate_countOfItem();
}
@Then("validate size of  list in filter dropdown")
public void validate_size_of_list() {
	pp.validate_size_of_list_in_filter();
}

@Then("validate text of all option in filter dropdown")
public void validate_option_text() {
	pp.validate_option_text();
}
@Then("validate count of item after adding two item")
public void validate_count_after_adding_two_elm() {
	pp.validate_count_after_adding_two_elm();
}





}
