package org.today;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class March {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasan cross\\eclipse-workspace\\Seleniumnew\\driver\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions(); //options - referance name
	options.addArguments("--disable-notifications");
		
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
	Thread.sleep(2000);
	
	WebElement electronics = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[3]/a/div[2]"));
	electronics.click();
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/span[1]")).click();
	
	
	
	}
	

	
	
	
	
	
	
	
	
}
