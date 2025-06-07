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

public class ToLearnSingleSelect {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        WebElement country = driver.findElement(By.id("sView1:r1:0:country::content"));
	    Select countrySel=new Select(country);
	    countrySel.selectByVisibleText("USA");
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File Temp = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShot/OracleCreateAccount.png");
	    FileHandler.copy(Temp, dest);
	}

	
}
