package Formy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement bu = driver.findElement(By.xpath("/html/body/div/div/li[2]/a"));
		Actions ae = new Actions(driver);
		bu.click();
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form/div[1]/div/div/button[1]")));
		
		//Primary Button
		WebElement primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
		ae.click(primary).perform();
		
		//success button
		WebElement success = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]"));
		ae.click(success).perform();
		
		//info button
		WebElement info = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
		ae.click(info).perform();
		
		//warning button
		WebElement warning = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
		ae.click(warning).perform();
		
		//danger button
		WebElement danger = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
		ae.click(danger).perform();
		
		//link
		WebElement link = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]"));
		ae.click(link).perform();
		
		//left
		WebElement left = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
		ae.click(left).perform();
		
		//middle
		WebElement middle = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
		ae.click(middle).perform();
		
		//Right
		WebElement right = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
		ae.click(right).perform();
		
		//1
		WebElement one = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]"));
		ae.click(one).perform();
		
		//2
		WebElement two = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[2]"));
		ae.click(two).perform();
		
		//dropdown
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
		ae.click(drop).perform();
		
		//droplink1
		WebElement droplink1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
		ae.click(droplink1).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btnGroupDrop1\"]")));
		
		
		//droplink2
		WebElement drops = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
		ae.click(drops).perform();
		WebElement droplink2 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
		ae.click(droplink2).perform();
			

	}

}
