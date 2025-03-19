package FMCG;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;



	public class TEST {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();

	driver.get("https://sanffa.info");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUserName")).sendKeys("adminqc");
	driver.findElement(By.id("txtPassWord")).sendKeys("Qc1");
	WebElement btn= driver.findElement(By.id("btnLogin"));
	btn.click();
	WebElement div = driver.findElement(By.xpath("//*[@id=\"dd1division\"]/option[contains(text(),'Sathish')]"));
	div.click();
	WebElement btnw= driver.findElement(By.id("btndash"));
	btnw.click();
	// WebElement master = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]"));
	// master.click();
	// WebElement fieldforce = driver.findElement(By.xpath("//*[@id=\"menumas_lim10\"]/a"));
	// fieldforce.click();
	// WebElement newid = driver.findElement(By.id("btnNew"));
	// newid.click();
	// WebElement back = driver.findElement(By.id("menu1_btnBack"));
	// back.click();
	WebElement master1 = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]"));
	master1.click();
	WebElement fieldforceentries = driver.findElement(By.xpath("//*[@id=\"menumas_lim17\"]/following-sibling::li/a"));

	//Creating object of an Actions class
	Actions action = new Actions(driver);

	//Performing the mouse hover action on the target element.
	action.moveToElement(fieldforceentries).perform();
	WebElement listeddoc = driver.findElement(By.xpath("//*[@id=\"menumas_lim20\"]/a"));
	listeddoc .click();
	// WebElement searchbar = driver.findElement(By.id("txtNew"));
	// searchbar.sendKeys("guna");
	Select objSelect =new Select(driver.findElement(By.id("ddlSFCode")));
	//objSelect.selectByVisibleText("senthil - SO - Chennai");
	//objSelect.selectByIndex(1);
	objSelect.selectByValue("MR8346");
	WebElement go = driver.findElement(By.id("btnGo"));
	go.click();

	//driver.quit();
	//WebElement logout_Btn= driver.findElement(By.xpath("//*[@id=\"menu\"]/li[6]/a"));

	//logout_Btn.click();
	}



	}

