package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbloginNegative {
	EdgeDriver driver;
	@Given("Chrome Browser should be invoked")
	public void browser() {
		driver =new EdgeDriver();
		
			}
	@And("fb login page should be visible")
	public void fb_loginpage() {
		driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));    
		
			}
	@When("Enter Username {string} and Password {string}")
	public void fb_invalidCredential(String uname,String pass) {
		driver.findElement(By.name("email")).sendKeys("uname");
		driver.findElement(By.name("pass")).sendKeys("pass");
		
	}
	@And("click on fb login button")
	public void click_login() {
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")).click();
	}
	@Then("login should be failed when user enter invalid credential")
	public void result_ofLogin() {
		System.out.println("Error msg displayed");
	}
	
}
