package Computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_HOME_010_TEST extends BaseClass{
	@Test
	public void clickOnComputers() {
		ExtentTest test = eReport.createTest("clickOnBooks");
		HomePage hp=new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/computers");
		test.log(Status.PASS, "Computers page is displayed");
	}
}
