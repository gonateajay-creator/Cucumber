package Stepdefination;

//import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class swaglabEachLogin_username {
	
	ChromeDriver driver;
	@Given("launch swaglab website")
	public void launch_swaglab_website() {
	    // Write code here that turns the phrase above into concrete actions
		    driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
	}

	@When("enter username as {string} and password as {string}")
	public void enter_username_as_standard_user_and_password_as_secret_sauce(String uname, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-name")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login-button")).click();
//        System.out.println("Valid Login Successful");
	}

	@Then("swaglab login should be succeddfull")
	public void swaglab_login_should_be_succeddfull() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("valid login successfully");
	}
}