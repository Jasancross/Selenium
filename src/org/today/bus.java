package org.today;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class bus {

	public static void main(String[] args) throws InterruptedException {
	
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasan cross\\eclipse-workspace\\Seleniumnew\\driver\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://ca.megabus.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	}
	
	
	
	
}
