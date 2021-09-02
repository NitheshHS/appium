package com.android.capabilities;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUIautomator extends Base{
	public static void main(String[] args) throws Throwable {
		AndroidDriver<AndroidElement> driver = capabalities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		Thread.sleep(2000);
		driver.closeApp();
	}

}
