package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider
	public String[][] dataSender(){
	String[][] data= {{"Blessy","Jasmin","BJasmin@gmail.com","b2343536","123456"},{"Ble","Jas","BJasmin@gmail.com","b2343536","b2343536"},{"alex","juan","alex@gmail.com","b2343536","b2343536"},{"Joaquin","Joa","Joaquin@gmail.com","Alex64547","Alex64547"},{"Orial","alphanzo","Orial@gmail.com","alph2435","alph2435"}};
    return data;
	}
	@Test(dataProvider = "dataSender")
	public void register(String[] cred) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("FirstName")).sendKeys(cred[0]);
		driver.findElement(By.id("LastName")).sendKeys(cred[1]);
		driver.findElement(By.id("Email")).sendKeys(cred[2]);
		driver.findElement(By.id("Password")).sendKeys(cred[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
	}
	
}
