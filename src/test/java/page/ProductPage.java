package page;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.BaseClass;


public class ProductPage extends BaseClass {
	
	public void click_on_add_to_cart() {
		WebElement elm=driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
		   clickonelement(elm);
	}

	public void click_on_basket() {
		WebElement elm=driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']"));
	   clickonelement(elm);
	   
	}
	
	public void clickOnCheckout() throws InterruptedException {
		WebElement elm=driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']"));
		clickonelement(elm);
		Thread.sleep(3000);
	}
	public void click_on_filter_dropdown() {
		WebElement elm=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		clickonelement(elm);
	}
	public void add_two_item_on_basket() {
		WebElement elm1=driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
		WebElement elm2=driver.findElement(By.xpath("//div[@class='inventory_list']//div[2]//div[3]//button[1]"));
		clickonelement(elm1);
		clickonelement(elm2);
	}
	
	public void ValidateText() {
		WebElement elm=driver.findElement(By.xpath("//div[contains(text(),'Checkout: Your Information')]"));
		validateText(elm,"Checkout: Your Information");
	}
	public void validate_countOfItem() {
		WebElement elm=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		validateText(elm, "1");
		}
	public void validate_size_of_list_in_filter() {
		List<WebElement> list=driver.findElements(By.xpath("//select[@class='product_sort_container']/option"));
		validateSizeOfList(list, 4);
	}
	//Validation for text which is present in list of filter dropdwon
	public void validate_option_text() {
		List<WebElement> list=driver.findElements(By.xpath("//select[@class='product_sort_container']/option"));
		List<String>list2=new ArrayList<String>();
		list2.add("Name (A to Z)");
		list2.add("Name (Z to A)");
		list2.add("Price (low to high)");
		list2.add("Price (high to low)");
		for(int i=0;i<list.size();i++) {

			assertEquals(list.get(i).getText(), list2.get(i));
		}
	}
	public void validate_count_after_adding_two_elm() {
		WebElement elm=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		
		validateText(elm, "2");
	}
	
	

}
