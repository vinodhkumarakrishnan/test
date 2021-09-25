package com.proj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.westernunion.com/in/en/web/user/register");

		driver.findElement(By.xpath("//option[@value='BR']")).click();
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("manoj");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manoj");
		//driver.findElement(By.xpath("//input[@amplitude-id='textbox-fname']")).sendKeys("manoj");
		//driver.findElement(By.xpath("//select[contains(@option,'' )]").click();
	}

}
