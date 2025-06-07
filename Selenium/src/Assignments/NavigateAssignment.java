package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAssignment {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize();
				driver.navigate().to("https://www.myntra.com");
				// driver.navigate().to("https://www.myntra.com");
				 Thread.sleep(2000);
				 
				 String title = driver.getTitle();
				 System.out.println(title);
				 if(title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) {
					 System.out.println("Myntra page is displyed");
				 }
					 else {
						 System.out.println("Myntra page is not displayed");
					 
				 }
				 String windowid = driver.getWindowHandle();
			     System.out.println(windowid);
			     Thread.sleep(2000);
				 driver.navigate().back();
				 Thread.sleep(2000);
				 
				 driver.navigate().forward();
				 Thread.sleep(2000);
				 
				 driver.close();
			}

		}


