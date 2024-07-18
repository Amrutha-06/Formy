 package Formy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Complete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement complete = driver.findElement(By.xpath("/html/body/div/div/li[14]/a"));
		complete.click();
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"first-name\"]")));
		
		WebElement fname = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		fname.sendKeys("Amrutha");
		
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		lname.sendKeys("Sali");
		
		WebElement job = driver.findElement(By.xpath("//*[@id=\"job-title\"]"));
		job.sendKeys("Tester");
		
		WebElement study = driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]"));
		study.click();
		
		WebElement se = driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
		se.click();
		
		Select yof = new Select(driver.findElement(By.xpath("//*[@id=\"select-menu\"]")));
		yof.selectByIndex(1);
		
		WebElement dob = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		dob.click();
		
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]"));
		month.click();
		
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]"));
		year.click();
		
		WebElement year1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[3]"));
		year1.click();
		
		WebElement month1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[5]"));
		month1.click();
		
		WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]"));
		day.click();
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
		submit.click();
		

	}

}
