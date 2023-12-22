package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.BaseClass;


public class PDPpage extends BaseClass {

    public void click_on_element_name() {
    	WebElement elm=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
		clickonelement(elm);
	}
	
	public void click_on_add_cart_from_pdp_side() {
		WebElement elm=driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']"));
		clickonelement(elm);
	}
	
	public void validate_count_of_basket(){
		WebElement elm=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		validateText(elm,"1");
	}
	
}
