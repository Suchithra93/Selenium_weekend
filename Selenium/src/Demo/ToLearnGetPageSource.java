package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.myntra.com/");
		driver.get("https://www.facebook.com/");
		//driver.get("https://demowebshop.tricentis.com/login");
		String SourceCode = driver.getPageSource();
		System.out.println(SourceCode);
		

}
	
}
