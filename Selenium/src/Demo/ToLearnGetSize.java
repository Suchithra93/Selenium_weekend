package Demo;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	
	public static void main(String[]args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/sarees/kalini/kalini-ethnic-motif-woven-design-zari-banarasi-saree/22866694/buy");
			Dimension size = driver.manage().window().getSize();
			System.out.println(size); 
			System.out.println(size.getHeight());
			System.out.println(size.getWidth());
			driver.manage().window().setSize(new Dimension(1000,500));
			Thread.sleep(5000);
			driver.close();
}
}
