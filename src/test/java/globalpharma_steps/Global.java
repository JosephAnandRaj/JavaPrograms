package globalpharma_steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Global {
	
    public static WebDriver driver;

	public static void main (String args[]) {
		
		 browser();
	     login("dinesh236@sansupport.in","123456");
	    }
	    

	    public static void browser() {
	            driver = new ChromeDriver();
	            driver.get("http://103.152.79.87:81");
	            driver.manage().window().maximize(); 
	            try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    }
	   public static void login(String Username,String Password) {
		      driver.findElement(By.id("emailInput")).sendKeys(Username);
		      try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      //driver.findElement(By.id("passwordInput")).sendKeys(Password);
		      driver.findElement(By.xpath("//*[@id=\"passwordInput\"]/div/input")).sendKeys(Password);
		      driver.findElement(By.id("loginButton")).click();
	   }
	
	
}
