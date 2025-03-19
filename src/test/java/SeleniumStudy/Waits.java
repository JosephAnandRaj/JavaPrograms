package SeleniumStudy;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	Logger log = LogManager.getLogger(Waits.class);
	
	public void method() {
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://sjqa.salesjump.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys("adminsjqa");
		driver.findElement(By.id("txtPassWord")).sendKeys("sjqa");
		
		
//		WebDriverWait explicitwait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement Loginbtn = explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
//		Loginbtn.click();
		
		try {
		Wait<WebDriver> fluentwait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		WebElement Loginbtn = fluentwait.until(ExpectedConditions.elementToBeClickable(By.id("tnLogin")));
		Loginbtn.click();
		
        log.info("Login button clicked successfully.");
		}
		catch (Exception e) {
	//		System.out.println("Timeout exception occured");
		log.error("Log message: "+e);	
		}
		finally {
		
		driver.quit();
		}
		
	}
	
	public static void main(String[] args) {
		Waits w = new Waits();
		w.method();
	}

}
