package FMCG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static WebDriver driver;

    public static void main(String[] args)  {
        browser();
        login("Admintest","test");
    }
    

    public static void browser() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Josep\\Desktop\\WebDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://fmcg.sanfmcg.com/");
            driver.manage().window().maximize(); 
    }
   public static void login(String Username,String Password) {
	      driver.findElement(By.id("txtUserName")).sendKeys(Username);
	      driver.findElement(By.id("txtPassWord")).sendKeys(Password);
	      driver.findElement(By.id("btnLogin")).click();
   }
}