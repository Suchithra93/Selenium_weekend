package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
}
}
