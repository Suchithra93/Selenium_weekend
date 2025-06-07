package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("m//span[text()='Train Tickets']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Check PNR status']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='19037 AVADH EXP']/../..//button[text()='Show Availability']")).click();
	}

}
