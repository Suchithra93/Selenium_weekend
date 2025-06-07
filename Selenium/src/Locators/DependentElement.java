package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.shoppersstack.com/sub-category/mobile");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[text()='apple']/../..//button[@type='button']")).click();
		//driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters&p%5B%5D=facets.brand%255B%255D%3DApple");
		//Thread.sleep(5000);
        //driver.findElement(By.xpath("//div[text()='Nothing Phone (3a) (Blue, 128 GB)']/../..//div[text()='Free delivery']")).click();
	    //driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters&p%5B%5D=facets.brand%255B%255D%3DApple");
	    //driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Blue, 128 GB)']/../..//div[text()='Save extra with combo offers']")).click();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']")).click();
	
	}

}
