package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Log in with Facebook']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Email address')]")).sendKeys("suchithra123@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hello123");
        driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
