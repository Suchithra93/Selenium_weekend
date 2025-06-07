package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
	    WebElement date = driver.findElement(By.id("day"));
	    Select dateSel=new Select(date);
	    dateSel.selectByValue("15");
	    WebElement month = driver.findElement(By.id("month"));
	    Select monthSel=new Select(month);
	    monthSel.selectByIndex(7);
	    WebElement year = driver.findElement(By.id("year"));
	    Select yearSel=new Select(year);
	    yearSel.selectByVisibleText("1947");
	    
	    

	}

}
