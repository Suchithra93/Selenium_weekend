package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearSel = new Select(year);
		yearSel.selectByValue("1905");
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSel = new Select(monthDropdown);
		List<WebElement> allOptions = monthSel.getOptions();
		for(WebElement ele:allOptions) {
			String month = ele.getText();
			monthSel.selectByVisibleText(month);
			System.out.println("Selected month: "+month);
			Thread.sleep(2000);
				
		}
	}

}
