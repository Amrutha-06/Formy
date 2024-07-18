package Formy;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement check = driver.findElement(By.xpath("/html/body/div/div/li[3]/a"));
		Actions ae = new Actions(driver);
		check.click();
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkbox-1\"]")));
		
		
		//Checkbox1
		WebElement check1 = (driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")));
		ae.click(check1).perform();
		
		//Checkbox2
		WebElement check2 = (driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]")));
		ae.click(check2).perform();
		
		//Checkbox3
		WebElement check3 = (driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")));
		ae.click(check3).perform();

	}

}
