package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchRedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators - redBus")) {
			System.out.println("redBus welcome page is displayed..");
		}
		else {
			System.out.println("redBus welcome page is not displayed");
		}
		//String SourceCode = driver.getPageSource();
		//System.out.println(SourceCode);
		Thread.sleep(8000);
		driver.close();
		
 }
}
