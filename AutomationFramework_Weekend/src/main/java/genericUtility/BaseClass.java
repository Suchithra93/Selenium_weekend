
package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;

public class BaseClass {
	public static ExtentReports eReport;
	public static WebDriver driver;
	
	public javaUtility jutil = new javaUtility();
	public WebDriverUtility wUtil= new WebDriverUtility();
	public WebDriverUtility uUtil = new WebDriverUtility();
	public FileUtility fUtil = new FileUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	
	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark =new ExtentSparkReporter("./HTML_Reports/"+jutil.getSystemTime()+"html");
	    eReport = new ExtentReports();
	    eReport.attachReporter(spark);
	}
	@BeforeClass
	public void OpenBrowser() throws IOException {
		driver = new ChromeDriver();
		wUtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(fUtil.getDataFromProperty("url"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(fUtil.getDataFromProperty("email"));
		lp.getPasswordTextField().sendKeys(fUtil.getDataFromProperty("password"));
		lp.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() {
		HomePage hp = new HomePage(driver);
		hp.getLogoutLink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		
	}
	
	@AfterSuite
	public void reportBackup() {
		eReport.flush();
	}

}
