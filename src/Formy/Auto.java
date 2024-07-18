package Formy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("/html/body/div/div/li[1]/a"));
		button.click();
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autocomplete\"]")));
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		address.sendKeys("Kottayam");
		
		WebElement street1 = driver.findElement(By.xpath("//*[@id=\"street_number\"]"));
		street1.sendKeys("Koothattukulam");
		
		WebElement street2 = driver.findElement(By.xpath("//*[@id=\"route\"]"));
		street2.sendKeys("Mangalathuthazham");
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"locality\"]"));
		city.sendKeys("Palakuzha");
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"administrative_area_level_1\"]"));
		state.sendKeys("kerala");
		
		WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"postal_code\"]"));
		Zipcode.sendKeys("686662");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		country.sendKeys("India");
		

	}

}
