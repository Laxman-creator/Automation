package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.BaseClass;

public class CheckOutPage extends BaseClass {

	public void enterfirstname_last_name_and_zipcode(String string, String string2, String string3) {
		log.info("checkout page starting");
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(string);
		log.info("entering first name");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(string3);
	}

	public void clickoncontinuebutton() {
		
		WebElement elm = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		clickonelement(elm);
		
	}

	public void clickOnfinishbtn() {
		WebElement elm = driver.findElement(By.xpath("//a[normalize-space()='FINISH']"));
		clickonelement(elm);
	}

	public void validatetext() {
		WebElement elm = driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']"));
		validateText(elm, "THANK YOU FOR YOUR ORDER");
	}

	public void validate_error_message_without_giving_zipcode() {
		WebElement elm = driver.findElement(By.xpath("//h3[normalize-space()='Error: Postal Code is required']"));
		assertEquals(elm.isDisplayed(), true);
	}

	public void validate_error_message_without_giving_lastname() {
		WebElement elm = driver.findElement(By.xpath("//h3[normalize-space()='Error: Last Name is required']"));
		explicitwait(elm, "visibilityof");
		assertEquals(elm.isDisplayed(), true);
	}

	public void validate_error_message_without_giving_firstname() {
		WebElement elm = driver.findElement(By.xpath("//h3[normalize-space()='Error: First Name is required']"));
		assertEquals(elm.isDisplayed(), true);
	}

	public void validate_error_message_without_giving_anyInput() {
		WebElement elm = driver.findElement(By.xpath("//h3[normalize-space()='Error: First Name is required']"));
		assertEquals(elm.isDisplayed(), true);
	}

}
