package com.proj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WUproj {

	public static void main(String[] args) {
		public void db() {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.westernunion.com/in/en/web/user/register");
			
			driver.findElement(By.id("firstName")).sendKeys("vinodh");
			driver.findElement(By.id("middleName")).sendKeys("kumara");
			driver.findElement(By.id("lastName")).sendKeys("krishnan");
			driver.findElement(By.id("dob")).sendKeys("29/11/1996");
			driver.findElement(By.id("email")).sendKeys("vinodhrocks15@gmail.com");
			driver.findElement(By.id("password")).sendKeys("23@Vinodhkrishnan");
			driver.findElement(By.id("address1")).sendKeys("1 ring road");
			driver.findElement(By.id("city")).sendKeys("chennnai");
			driver.findElement(By.id("cboState")).sendKeys("tamilnadu");
			driver.findElement(By.id("zip")).sendKeys("600063");
			driver.findElement(By.id("txtPhoneNum1")).sendKeys("9787002546");
			driver.findElement(By.id("option3")).click();
			//driver.findElement(By.id("option2")).sendKeys("");
			driver.findElement(By.id("dropdown-nationality")).click();
			driver.findElement(By.id("occupationTxt")).sendKeys("Engineer");
			driver.findElement(By.id("answer")).sendKeys("neela");
			driver.findElement(By.id("chkMarketingOptions")).click();
			driver.findElement(By.id("legalTermsAndConditions")).click();
			driver.findElement(By.id("button-continue")).click();
			driver.findElement(By.linkText("Terms and Conditions")).click();
		}
			

	}

}
