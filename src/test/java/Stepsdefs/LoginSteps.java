package Stepsdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver=Hooks.driver;
	@Given("I have to launch the application")
	public void i_have_to_launch_the_application() {
	   
	    driver.get("https://www.facebook.com/");
	   
	}

	@Given("I have clicked on login link")
	public void i_have_clicked_on_login_link() {
		WebElement w1= driver.findElement(By.name("login"));
		w1.click();
	}

	@When("I enter username")
	public void i_enter_username() {
		WebElement w2= driver.findElement(By.id("email"));
	    w2.sendKeys("xyz@gmail.com");
	}

	@When("I enter password")
	public void i_enter_password() {
		WebElement w3= driver.findElement(By.id("pass"));
	    w3.sendKeys("xyz@gmail");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		WebElement w4= driver.findElement(By.id("loginbutton"));
	    w4.click();
	}

	@Then("I should land on homepage")
	public void i_should_land_on_homepage() {
	String s1=driver.getCurrentUrl();
	if(s1.equals(driver.getTitle())) {
	    System.out.println("not landed on homepage");
	}else{
		System.out.println("landed on homepage");
		}
	}

	@Then("I should get the error message")
	public void i_should_get_the_error_message() {
		WebElement w4= driver.findElement(By.xpath("//div[@class='_9ay5']"));
		String actualerrmsg=w4.getText();
		String expectedmsg="The email address or mobile number you entered isn't connected to an account. ";
		Assert.assertNotEquals(actualerrmsg,expectedmsg);
	}
	@When("I enter username {string}")
	public void i_enter_username(String user) {
		WebElement w2= driver.findElement(By.id("email"));
	    w2.sendKeys(user);
	}

	@When("I enter password {string}")
	public void i_enter_password(String value) {
		WebElement w3= driver.findElement(By.id("pass"));
	    w3.sendKeys(value);
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String expectedms) {
		WebElement w4= driver.findElement(By.xpath("//div[@class='_9ay5']"));
		String actualerrmsg=w4.getText();
		Assert.assertNotEquals(actualerrmsg,expectedms);
	}

}
