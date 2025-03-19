package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{
	static WebDriver driver;

	public static void browser() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public static void text() {
	
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("Abc");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("123");
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
	}}