package Formy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.xpath("/html/body/div/div/li[6]/a"));
		drop.click();
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dropdownMenuButton\"]")));
		
		//Click for dropdown
		WebElement clicks = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
		clicks.click();
		
		//click for autocomplete
		WebElement auto = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		Thread.sleep(2000);
		auto.click();
		Thread.sleep(2000);
		
		//Back to page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Click for dropdown
		WebElement clickb = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
		Thread.sleep(2000);
		clickb.click();
		
		//Click for Button
		WebElement button = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
		button.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		
	}

}
