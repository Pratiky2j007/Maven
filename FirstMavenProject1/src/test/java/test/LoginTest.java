package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest
{
	
	@Test
	public void LoginTestMethod()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver fDriver=new FirefoxDriver();
		fDriver.get("https://opensource-demo.orangehrmlive.com/");
		fDriver.findElement(By.id("txtUsername")).sendKeys("admin");
		fDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		fDriver.findElement(By.id("btnLogin")).click();
		fDriver.close();
		
		System.out.println("adding changes- Bhagya");
		
		System.out.println("adding one line code github--aditya");
		
		System.out.println("Adding one line for github-Pratik");
		System.out.println("actual project");
		System.out.println("Komal");
		
	}
   
}
