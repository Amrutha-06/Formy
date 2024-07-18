package Formy;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		
		//WebElement drag = driver.findElement(By.xpath("https://formy-project.herokuapp.com/dragdrop"));
		//drag.click();
		//WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(5000));
		//waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"image\"]/img")));
		
		driver.switchTo();
		Actions ae = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[@id=\"image\"]/img"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"box\"]"));
		ae.clickAndHold(source).moveToElement(target).release().build().perform();

	}

}
