package com.android.capabilities;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidXpath extends Base {

	
	public static void main(String[] args) throws Throwable {
		AndroidDriver<AndroidElement> driver = capabalities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		//driver.lockDevice();
		//System.out.println("Device locked:- "+driver.isDeviceLocked());
		//driver.unlockDevice();
		System.out.println(driver.getContext());
		driver.findElementByXPath("//*[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//*[@text='WiFi settings']").click();
		driver.findElementById("android:id/edit").sendKeys("appium");
		System.out.println("KeyBoard is displayed "+driver.isKeyboardShown());
		driver.findElementById("android:id/button1").click();
		driver.closeApp();
		 driver.findElementById("android:id/button1");
	}
}
