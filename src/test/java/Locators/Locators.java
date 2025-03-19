package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main (String args[]) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lambdatest.com/blog/locators-in-selenium-webdriver-with-examples/");
    WebElement Email = driver.findElement(By.className("top-demo-email"));
    Email.click();
	
/*	
	// load the url
	driver.get("https://letcode.in/test-practice");
	//click login btn
	WebElement loginBtn = driver.findElement(By.linkText("Log in"));
//	WebElement loginBtn = driver.findElement(By.partialLinkText("Log"));
	loginBtn.click();
	//enter email id
	WebElement emailbtn = driver.findElement(By.name("email"));
	emailbtn.sendKeys("koushik350@gmail.com");
*/	

	
  }
}