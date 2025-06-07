package Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplimentation.class)
public class TestScript extends BaseClass{
@Test
public void login() {
	//Reporter.log("Open browser",true);
	//Reporter.log("Enter url",true);
	//Reporter.log("click on login link",true);
	//Reporter.log("Enter credentials",true);
	//Reporter.log("click on login button",true);
	//Assert.assertEquals(true, false);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("Suchihra@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Suchihra93803");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
	Reporter.log("Home page is displayed", true);
}
}
