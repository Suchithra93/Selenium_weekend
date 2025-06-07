package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Suchi23458");
	    driver.findElement(By.id("LastName")).sendKeys("J s");
	    driver.findElement(By.name("Email")).sendKeys("suchi@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.name("Password")).sendKeys("93803suchi");
	    Thread.sleep(2000);
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("93803suchi");
	    Thread.sleep(2000);
	    driver.findElement(By.name("register-button")).click();
		
	}

}


