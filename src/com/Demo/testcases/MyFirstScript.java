package com.Demo.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vhqtest.verifone.com");
		
		Thread.sleep(2000);
		
		if (driver.findElement(By.id("txtCompanyName")).isEnabled()) {
			System.out.println("\n Text box for email enabled \n ");
			driver.findElement(By.id("txtCompanyName")).sendKeys("T_SergyL1@verifone.com");
		}
		
		
		Thread.sleep(2500);
		
		if (driver.findElement(By.xpath("//*[@id=\"Btnsubmit\"]")).isEnabled()) {
			System.out.println("\n Button \"LogIn\" enabled \n ");
			driver.findElement(By.xpath("//*[@id=\"Btnsubmit\"]")).sendKeys(Keys.ENTER);
			System.out.println("\n Button \"LogIn\" clicked \n ");
		}
		
		Thread.sleep(2500);
		
		if (driver.findElement(By.name("password")).isEnabled()) {
			System.out.println("\n Text field \"Password\" enabled \n ");
			driver.findElement(By.name("password")).sendKeys("Vhq11111");
			driver.findElement(By.className("login-buttons")).click();
			System.out.println("\n Button \"LogIn\" clicked \n ");
		}
		
		System.out.println("\n The End \n ");
		
		//Thread.sleep(25000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		if (driver.findElement(By.xpath("//*[@id=\"deviceSearch\"]")).isEnabled()) {
			driver.findElement(By.xpath("//*[@id=\"deviceSearch\"]")).click();
		}
			
		
		
		
		
		
		//driver.close();
		
	

	}

}
