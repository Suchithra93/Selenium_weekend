package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email']")).click();
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email']")).sendKeys("78612345");

	}

}
