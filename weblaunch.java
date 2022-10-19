package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class weblaunch {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFM")).click();
	 driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Manisankaren");
	    driver.findElement(By.name("departmentName")).sendKeys("Automationtesting");
	    driver.findElement(By.name("description")).sendKeys("Located at Nanganallur");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manisankaren@gmail.com");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("Must view");
	    driver.findElement(By.name("submitButton")).click();
	     String title=driver.getTitle();
	     
	     System.out.println(title);
}
}