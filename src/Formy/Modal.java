package Formy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement modal = driver.findElement(By.xpath("/html/body/div/div/li[10]/a"));
		modal.click();
		
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-button\"]")));
		
		WebElement open = driver.findElement(By.xpath("//*[@id=\"modal-button\"]"));
		open.click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
       r.keyPress(KeyEvent.VK_ESCAPE);
       r.keyRelease(KeyEvent.VK_ESCAPE);
        
		
		
		
	}

}
