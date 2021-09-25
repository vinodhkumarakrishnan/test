package com.proj.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Alertmsg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name= 'q']")).sendKeys("OnePlus U Series 138.8 cm (55 inch) Ultra HD (4K) LED Smart Android TV");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='OnePlus U Series 138.8 cm (55 inch) Ultra HD (4K) LED Smart Android TV']")).click();
		String oldTab =  driver.getWindowHandle();
		System.out.println(oldTab);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(newTab);
	    newTab.remove(oldTab);
	    System.out.println(newTab);                                              
	    driver.switchTo().window(newTab.get(0));
	    driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

	}

}
