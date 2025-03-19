package SeleniumStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsexample {
	
	
	public void navigate() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://sjqa.salesjump.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).sendKeys("adminsjqa");
		driver.findElement(By.id("txtPassWord")).sendKeys("sjqa");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//span[text()='Master']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' Geography ']")).click();
		driver.findElement(By.xpath("//a[text()='Add Area']")).click();
		

		
		List<WebElement> options = driver.findElements(By.id("ctl00_ContentPlaceHolder1_ddlState"));
		
		for (WebElement option : options) {
			System.out.println(option.getText());

		}
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		findElementsexample a = new findElementsexample();
		a.navigate();
	}

}
