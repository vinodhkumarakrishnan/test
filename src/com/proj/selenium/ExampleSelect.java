package com.proj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleSelect {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//*[@id=\"button\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"endpoint\"]/tp-yt-paper-item")).click();
		
		
		
		
		
		
	}

}
