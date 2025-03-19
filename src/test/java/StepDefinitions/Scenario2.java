package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class Scenario2{
	WebDriver driver;
	String Username;
	String Password;
	
	ExtentReports extentReport;
	ExtentSparkReporter htmlReporter;
	ExtentTest testcase;
	
	@Given("Login with valid URL {string}")
	public void Login_with_valid_URL (String Url) {
		
		  extentReport = new ExtentReports(); htmlReporter = new
		  ExtentSparkReporter("ExtentReport.html");
		  extentReport.attachReporter(htmlReporter);
		 
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
			}
	
	@And("Login the Page with valid credentials {string} and {string}")
	public void Login_the_Page_with_valid_credentials(String username, String password) {
	    testcase = extentReport.createTest("Login the Page");
	    testcase.log(Status.INFO, "Navigating to Login Screen");
	    		driver.findElement(By.id("txtUserName")).sendKeys(username);
	    driver.findElement(By.id("txtPassWord")).sendKeys(password);
      driver.findElement(By.id("btnLogin")).click();
      
      WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"ctl00_Label1\"]"));

      if (logoutButton.isDisplayed()) {
  	    testcase.log(Status.INFO, "Navigating to Login Screen");
    	  testcase.log(Status.PASS, "Login Successfull for user");
          System.out.println("Login successful for user: " + username);

          try {
        	    TakesScreenshot screenshot = (TakesScreenshot) driver;
        	    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        	    File destinationFile = new File("Login.png");
        	    FileHandler.copy(sourceFile, destinationFile);
        	    testcase.addScreenCaptureFromPath("Login.png");
        	} catch (IOException e) {
        	    e.printStackTrace(); // Or handle the exception in a way appropriate to your application
        	}

          
          
      } else {
    	  testcase.log(Status.FAIL, "Login Not Successfull for user");
          System.out.println("Login failed for user: " + username);
          // Capture screenshot on failure
          try {
        	    TakesScreenshot screenshot = (TakesScreenshot) driver;
        	    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        	    File destinationFile = new File("LoginFail.png");
        	    FileHandler.copy(sourceFile, destinationFile);
        	    testcase.addScreenCaptureFromPath("LoginFail.png");
        	} catch (IOException e) {
        	    e.printStackTrace(); // Or handle the exception in a way appropriate to your application
        	}

      }

		/*
		 * System.out.println("Login Successful with username: " + Username +
		 * "and Password: " + Password);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"ctl00_Label1\"]")).click();
		 * driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/ul/li[5]/a")).
		 * click();
		 */    	driver.quit();
    	extentReport.flush();
    	    
}
}

    
    	