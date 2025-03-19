package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	WebDriver driver;
	String url = "https://letcode.in/dropdowns";
	WebElement fruits,country,superHeroes;

	public void Browser() {
		this.driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	
	public void dropdown_visibletext() {
		fruits = driver.findElement(By.id("fruits"));
		Select fruitdrp = new Select(fruits);
		fruitdrp.selectByVisibleText("Apple");
		fruitdrp.selectByVisibleText("Mango");
	}
	
	public void dropdown_value() {
		country = driver.findElement(By.id("country"));
		Select countrydrp = new Select(country);
		countrydrp.selectByValue("India");
	}
	
	public void dropdown_index() {
		superHeroes = driver.findElement(By.id("superheros"));
		Select superheroesdrp = new Select(superHeroes);
		superheroesdrp.selectByIndex(1);
		superheroesdrp.selectByIndex(3);
	}
	
	public void deselect() {
		Select superheroesdrp = new Select(superHeroes);
		superheroesdrp.deselectByIndex(1);
	}


	public static void main(String[] args) {

		Dropdown L = new Dropdown();
		L.Browser();
		L.dropdown_visibletext();
		L.dropdown_value();
		L.dropdown_index();
		L.deselect();

	}

}
