package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,700)");
		driver.findElement(By.linkText("Simple Computer")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		WebElement ErrorMsg = driver.findElement(By.id("bar-notification"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(ErrorMsg));
		//File Temp=driver.findElement(By.id("bar-notification")).getScreenshotAs(OutputType.FILE);
		File Temp=ErrorMsg.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/Error1.png");
		FileHandler.copy(Temp, dest);
		
		
		

	}

}
