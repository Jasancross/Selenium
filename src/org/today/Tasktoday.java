package org.today;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tasktoday {

	public static void main (String[]args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Jasan cross\\\\eclipse-workspace\\\\Seleniumnew\\\\driver\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement googletext = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
	googletext.sendKeys("Amazon");
	Thread.sleep(2000);
	
	List <WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//child::li//descendant::span"));
	
	for(int i =0; i<list.size(); i++) {
		
		System.out.println(list.get(i).getText());
	}
	

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
