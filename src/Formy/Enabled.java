package Formy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement ena = driver.findElement(By.xpath("/html/body/div/div/li[7]/a"));
		ena.click();
		
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input\"]")));
		
		WebElement input = driver.findElement(By.xpath("//*[@id=\"input\"]"));
		input.sendKeys("Amrutha");

	}

}
