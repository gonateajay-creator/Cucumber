package Stepdefination;
	import java.time.Duration;
	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class SignupLogin_dblaze {
		
		ChromeDriver driver;
		@Given("launch demoblaze website")
		public void launch_dblaze() {
		    driver=new ChromeDriver();
			driver.get("https://www.demoblaze.com/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
		}
		
		@When("user click on demoblaze signup")
		public void click_signup() {
			driver.findElement(By.id("signin2")).click();
		}
		
		@And("demoblaze user enter username and password")
		public void username_pass() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.id("sign-username")).sendKeys("ajayyyy");
			driver.findElement(By.id("sign-password")).sendKeys("455");
		}
		
		@And("click on signup button,handle popup")
		public void signup_btn() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
			//
			
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
//			System.out.println("Alert message:+al.text);
			al.accept();
		}
		@Then("signup successfull")
		public void done() throws InterruptedException {
			System.out.println("signup successfull");
			driver.navigate().back();
			Thread.sleep(3000);

		}


		//Login Demoblaze
		
		
		@Given("launch demoblaze website for login")
		public void launchblaze() {
		    driver=new ChromeDriver();
			driver.get("https://www.demoblaze.com/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
		
		@When("user click on demoblaze login")
		public void click_login() {
			driver.findElement(By.id("login2")).click();
		}
		
		@And("demoblaze user enter username and password for login")
		public void uspas() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.id("loginusername")).sendKeys("ajayyyy");
			driver.findElement(By.id("loginpassword")).sendKeys("455");
			Thread.sleep(1000);
		}
		
		@And("click on login button,handle popup")
		public void login_btn() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
			
		}
		@Then("login successfull")
		public void done_login() {
			System.out.println("login successfull");
			driver.quit();
		}
		
	}


