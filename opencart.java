package Week5.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencart {
	private static final String Duration = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();
      
		driver.findElement(By.id("input-username")).sendKeys("mani");
		driver.findElement(By.id("input-firstname")).sendKeys("sankaren");
		driver.findElement(By.id("input-lastname")).sendKeys("MS");
		driver.findElement(By.id("input-email")).sendKeys("manisankaren@gmail.com");
		driver.findElement(By.id("input-country")).click();
	
		WebElement country_id = driver.findElement(By.name("country_id"));
		WebElement dropdown = null;
		Select dd1 = new Select(dropdown);
		dd1.selectByIndex(99);
		driver.findElement(By.id("input-password")).sendKeys("MANI1234");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
	
	
		
	
}
}
