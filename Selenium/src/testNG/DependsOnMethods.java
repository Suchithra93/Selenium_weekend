package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register is successfull",true);
	}
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login is successfull",true);
		
}
	@Test(dependsOnMethods = {"register","login"})
	public void addToCart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/cart");
		Reporter.log("added to cart successfully",true);
}
}

