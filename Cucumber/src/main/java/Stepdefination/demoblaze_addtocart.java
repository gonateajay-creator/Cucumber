package Stepdefination;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoblaze_addtocart {
	EdgeDriver driver;
	@Given("demoblaze website should be launch")
	public void demoblaze_website_should_be_launch() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new EdgeDriver();
	    driver.get("https://www.demoblaze.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    
	}

	@When("clck on samsung phone")
	public void clck_on_samsung_phone() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();	   
	}

	@When("click on add to cart button")
	public void click_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Add to cart")).click();
	    
	}

	@When("Handle the alert message")
	public void handle_the_alert_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	@Then("Validate the outcome of demoblaze")
	public void validate_the_outcome_of_demoblaze() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Cart")).click();
	    System.out.println("outcome displayed");
	}

}
