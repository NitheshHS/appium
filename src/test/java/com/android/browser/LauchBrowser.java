package com.android.browser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class LauchBrowser extends BrowserBaseClass {

	public static void main(String[] args) throws Throwable {
		
		AndroidDriver<WebElement> driver = initBrowser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);
		List<WebElement> iphoneNames=driver.findElementsByXPath("//div[@class='a-section a-spacing-none']//span[contains(text(),'Apple')]");
		for(WebElement phoneName:iphoneNames) {
			System.out.println(phoneName.getText());
		}
		driver.closeApp();
		System.gc();
	}
}
