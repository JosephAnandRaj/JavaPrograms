package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

    public void login_the_page() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("http://fmcg.sanfmcg.com/");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        Thread.sleep(3000);
        
        String actual = driver.findElement(By.xpath("//*[@id=\"msg\"]")).getAttribute("innerHTML");
        String expected = "Enter User Name"; // This is intentionally incorrect
        Assert.assertEquals(actual, expected, "Fail: Error message not as expected. Actual: " + actual + ", Expected: " + expected);
        
        driver.quit();
    }
    

    public static void main(String[] args) throws InterruptedException {
        Assertion waiter = new Assertion();
        waiter.login_the_page();
    }
}
