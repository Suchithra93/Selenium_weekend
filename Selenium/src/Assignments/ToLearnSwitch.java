package Assignments;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitch {
		 public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://shoppersstack.com/products_page/23");
			Thread.sleep(20000);
			driver.findElement(By.id("compare")).click();
			String Window = driver.getWindowHandle();
			System.out.println("The parent window ID is: " +Window);
			Set<String> AllWindowIds = driver.getWindowHandles();
			

			for (String id : AllWindowIds) {
				System.out.println(id);
				driver.switchTo().window(id);
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
					if (driver.getWindowHandle()!=Window) {
						if (url.equals("https://www.ebay.com/")) {	
							System.out.println("Position of X axis is: " +driver.manage().window().getPosition().getX());
							System.out.println("Position of X axis is: " +driver.manage().window().getPosition().getY()); 
						}
						driver.close();		
				
				}
				
			}
			
		 }
}

