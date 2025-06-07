package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Sachin J S\\Downloads\\Project_Upload_Manual.pdf9");
	}

}
