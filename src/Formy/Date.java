package Formy;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Date {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement datepicker = driver.findElement(By.xpath("/html/body/div/div/li[4]/a"));
		datepicker.click();
		
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"datepicker\"]")));
		
		WebElement clicks = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		clicks.click();
		
		WebElement click1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]"));
		click1.click();
		
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]"));
		year.click();
		
		WebElement year1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[4]"));
		year1.click();
		
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[4]"));
		month.click();
		
		WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[6]"));
		day.click();

	}

}
