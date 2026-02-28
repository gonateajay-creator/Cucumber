package Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmaillogin {
	
	@Given("user should create the account on gmail")
	public void create_ac() {
		
		System.out.println("Precondition:user created the account");
		
	}
	@When("launch gmail website")
	public void login_steps() {
		
		System.out.println("launch gmail website");
	}
	@And("enter email and password")
	public void l() {
		System.out.println("enter email and password");
	}
	@And("click on login button")
	public void k() {
		System.out.println("click on login button");
	}
	@Then("login should be successfull")
	public void login_button() {
		
		System.out.println("Expected result:login successfull");
	}

}
