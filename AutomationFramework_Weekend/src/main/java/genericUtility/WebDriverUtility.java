package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WebDriverUtility {

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void captureSize(WebDriver driver) {
		driver.manage().window().getSize();
	}

	public void mouseHover(WebDriver driver) {
		Actions act = new Actions(driver);
	}

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void swichToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public void switchBackToHome(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void getPhoto(WebDriver driver) throws IOException {
		javaUtility jUtil = new javaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshots/" + jUtil.getSystemTime() + ".png");
		FileHandler.copy(temp, dest);

	}
}
