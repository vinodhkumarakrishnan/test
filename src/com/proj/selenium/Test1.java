package com.proj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

public static void main(String [] args)	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sorry justin");
	
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	
	
}
	
}
