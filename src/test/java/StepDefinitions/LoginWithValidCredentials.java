package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithValidCredentials{
	WebDriver driver;
	String Username;
	String Password;
	
	@Given("user navigate to Login page {string}")
	public void user_navigate_to_Login_page(String Url) {
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	@When("user enters the valid username and Password {string}{string}")
	public void user_enters_the_valid_username_and_Password(String Username, String Password) {
	    this.Username = Username;
	    this.Password = Password;
		driver.findElement(By.id("txtUserName")).sendKeys(Username);
	    driver.findElement(By.id("txtPassWord")).sendKeys(Password);
	}

	
	
	@And("Click on the Login button")
	public void Click_on_the_Login_button() {
	      driver.findElement(By.id("btnLogin")).click();

	}
	
	@Then("the user should get navigated to Home Page")
	public void the_user_should_get_navigated_to_Home_Page() {
		System.out.println("Login Successful with username: " + Username + "and Password: " + Password);
	}
	
    @And("User logout the Application")
    public void User_logout_the_Application() {
    	driver.findElement(By.xpath("//*[@id=\"ctl00_Label1\"]")).click();
    	driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/ul/li[5]/a")).click();
    	driver.quit();
    	    }
}
    
    	