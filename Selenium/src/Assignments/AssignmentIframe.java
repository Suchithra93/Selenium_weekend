package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AssignmentIframe {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement iFrame = driver.findElement(By.xpath("//iframe[contains(@src,'https://api-prod.capcvet.org/api/embed/pda/')]"));
		driver.switchTo().frame(iFrame);
		driver.findElement(By.name("Montana")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@class='button compact yellow']")).click();
		driver.findElement(By.id("user")).sendKeys("Fernandez@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("FallOnlyToRaiseAgain");
		driver.findElement(By.id("cpass")).sendKeys("FallOnlyToRaiseAgain");
		driver.findElement(By.id("firstName")).sendKeys("Alphanzo");
		driver.findElement(By.id("lastName")).sendKeys("maagi");
		driver.findElement(By.id("phone")).sendKeys("456744566");
		WebElement userType = driver.findElement(By.id("user-type"));
		Select type = new Select(userType);
		type.selectByVisibleText("Veterinarian");
		driver.findElement(By.id("accept-tou")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/pet.png");
		FileHandler.copy(Temp, dest);
		}

}
