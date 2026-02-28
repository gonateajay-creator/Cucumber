package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class thinking_tester_signup {
	ChromeDriver driver;
	@Given("launch thinkingtester website")
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	@When("user click on first name,last name")
	public void firstlast_name() {
		driver.findElement(By.id("firstName")).sendKeys("ajay");
		driver.findElement(By.id("lastName")).sendKeys("devgan");
	}
	@And("user click on email and password")
	public void mailPass() {
		driver.findElement(By.id("email")).sendKeys("ajay123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ajay2003");
		
	}
	@Then("click on submit button")
	public void submit() {
		driver.findElement(By.id("submit")).click();
		
	}
	
	
	

}
