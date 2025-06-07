package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
	
		Set<String> allWindows = driver.getWindowHandles();
		for(String id:allWindows) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart")) {
				break;
			}
			
		}
		driver.close();
		
		Set<String> allWindows1 = driver.getWindowHandles();
		for(String id:allWindows) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			if(url.contains("ebay")) {
				break;
			}
			
		}
       driver.manage().window().maximize();
	}
	

}
