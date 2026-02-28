package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrmlogin {
    
	ChromeDriver driver;
	
	@Given("User is on OrangeHRM login page")
	public void orglaunch() {
		driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));    }
	@When("User enters valid username and valid password")
	public void Validinfo() throws InterruptedException {
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@And("user clicks on login button")
	public void login() throws InterruptedException {
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
	
	@Then("Verify login should be successfull")
	public void loggedin() throws InterruptedException {
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
	}
	@And("User clicks on user profile dropdown")
	public void pro() {
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		
	}
	@And("user click on logout")
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}
	@Then("Orangehrm logout successfull")
	public void home() {
		System.out.println("logout successfull");
	}
	

	}