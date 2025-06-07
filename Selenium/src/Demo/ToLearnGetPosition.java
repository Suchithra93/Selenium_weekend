package Demo;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {
	
	public static void main(String[]args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/sarees/kalini/kalini-ethnic-motif-woven-design-zari-banarasi-saree/22866694/buy");
			driver.manage().window().maximize(); 
			Point position = driver.manage().window().getPosition();
			System.out.println(position.getX());
			System.out.println(position.getY());
			driver.manage().window().setPosition(new Point(400,200));
}
}

