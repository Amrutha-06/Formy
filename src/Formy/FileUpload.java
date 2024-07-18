package Formy;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement file = driver.findElement(By.xpath("/html/body/div/div/li[8]/a"));
		file.click();
		
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
	    waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form/div/div/span[1]/button")));
		
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file-upload-field\"]"));
		fileInput.sendKeys("C:\\Users\\HP\\Desktop\\ME!!!!!!!\\20221024_145620.jpg");
		Thread.sleep(2000);
		WebElement reset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
		reset.click();
	   
	}

}

