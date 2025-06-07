package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
	
	public static void main(String[]args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			driver.manage().window().minimize();
			driver.manage().window().fullscreen();
			driver.close();
}
}
