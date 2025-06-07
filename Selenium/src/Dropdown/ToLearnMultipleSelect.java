package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Sachin%20J%20S/Desktop/MultipleSelect.html");
		WebElement cars = driver.findElement(By.id("cars"));
		Select carSel = new Select(cars);
		carSel.selectByIndex(0);
		carSel.selectByValue("f");
		carSel.selectByVisibleText("bmw");
		
		Thread.sleep(2000);
		//carSel.deselectByIndex(0);
		//Thread.sleep(2000);
		//carSel.deselectByValue("f");
		//Thread.sleep(2000);
		//carSel.deselectByVisibleText("bmw");
		carSel.deselectAll();
		
		

	}

}
