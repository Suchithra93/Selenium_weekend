package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/sarees/all+about+you/all-about-you-embroidered-satin-saree/28206710/buy");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Buy All About You Embroidered Satin Saree - Sarees for Women 28206710 | Myntra\r\n"
				)) {
			System.out.println("Myntra saari page is displayed..");
		}
		else {
			System.out.println("Myntra saari page is displayed.");
		}
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		driver.manage().window().setPosition(new Point(400,300));
		Thread.sleep(5000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.manage().window().setSize(new Dimension(350,250));
		Thread.sleep(5000);
		driver.close();
	}

}
