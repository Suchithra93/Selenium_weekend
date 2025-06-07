package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnget {
public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	//driver.get("https://www.facebook.com/");
	 String title = driver.getTitle();
	 System.out.println(title);
	 if(title.equals("Instagram")) {
		 System.out.println("User is navigated to Instagram home page");
	 }
	 else {
		 System.out.println("User is failed to navigate home page"); 
	 }
	
}
}
