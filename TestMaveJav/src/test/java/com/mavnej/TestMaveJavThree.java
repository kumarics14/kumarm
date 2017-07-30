package com.mavnej;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestMaveJavThree {
	public static WebDriver driver;
	@Test
	public static void googlesearchtest() throws InterruptedException{
	/*System.setProperty("webdriver.firefox.marionette","D:\\Browsers\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();		
	capabilities.setCapability("marionette", true);	*/
	driver=new FirefoxDriver();  //(capabilities);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("BANG");
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(5000L);
	driver.findElement(By.name("btnG")).sendKeys(Keys.PAGE_DOWN);
	Thread.sleep(5000L);
	driver.quit();
System.out.println("Google Page is Opened");

	}
}



