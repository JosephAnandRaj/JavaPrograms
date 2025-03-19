package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test
{
	static WebDriver driver;

	public static void browser() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().window().maximize();
	}
	
	public static void attribute() {
		//@attribute using conditional such as and, or
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter registered email' and @name = 'email']"));
		//@attribute without using conditional
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		email.click();
		email.sendKeys("Joseph");
		password.click();
		password.sendKeys("123");
	}

	public static void clp() {

		//contains
		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter registered email') and contains(@type,'text')]"));
		//last
		WebElement password = driver.findElement(By.xpath("(//input)[last()-1]"));
		//position
		WebElement loginbtn = driver.findElement(By.xpath("(//button)[position()=1]"));
		email.click();
		email.sendKeys("Joseph");
		password.click();
		password.sendKeys("123");
		loginbtn.click();
	}
	
	public static void text() {
		
		WebElement workspace = driver.findElement(By.xpath("//a[contains(text(),'Work-Space')]"));
		workspace.click();
		WebElement courses = driver.findElement(By.xpath("//a[text()='Courses']"));
		courses.click();

	}
	
	public static void parentChildAnchestor() {
		
	}

	
	public static void main(String args[]) {
		test.browser();
	//	test.attribute();
	//	test.clp();
	//	test.text();
		test.parentChildAnchestor();

	}

}