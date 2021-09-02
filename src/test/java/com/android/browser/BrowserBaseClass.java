package com.android.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserBaseClass {
	
	public static AndroidDriver<WebElement> initBrowser() throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		return driver;
		
	}

}
