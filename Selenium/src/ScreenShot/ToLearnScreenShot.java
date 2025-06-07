
package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnScreenShot {

	public static void main(String[] args) throws IOException {
	String time = LocalDateTime.now().toString().replace(":", "-");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShot/"+time+"new.png");
	FileHandler.copy(Temp, dest);

	}

}
