
package Books;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_DWS_001_Test extends BaseClass {
	@Test
	public void clickOnBooks() {
		ExtentTest test = eReport.createTest("clickOnBooks");
		HomePage hp=new HomePage(driver);
		hp.getBooksLink().click();
		test.log(Status.PASS, "Books page is displayed");
		test.log(Status.PASS, "Books page is displayed");
	}

}
