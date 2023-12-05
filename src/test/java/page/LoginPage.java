package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.BaseClass;

public class LoginPage extends BaseClass {
	
public void enter_valid_username_and_valid_password(String username, String password) {
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    
	}

	
	public void click_on_login_button() {
		WebElement btn=driver.findElement(By.xpath("//input[@id='login-button']"));
		clickonelement(btn);
	   
	}

	
	public void validate_login_successfully() {
		WebElement elm=driver.findElement(By.xpath("//div[@class='product_label']"));
	   validateText(elm, "Products");
	}

}
