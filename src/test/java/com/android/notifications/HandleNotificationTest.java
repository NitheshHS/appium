package com.android.notifications;

import java.time.Duration;

import com.android.capabilities.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HandleNotificationTest extends Base{

	public static void main(String[] args) throws Throwable {
		
		AndroidDriver<AndroidElement> driver=capabalities();
		openNotification(driver);
		driver.toggleWifi();
		runAppInBackground(driver,5);
		driver.findElementByXPath("//*[@text='Views']").click();
		
	}

	/**
	 * Open the notifications 
	 * @param driver
	 */
	public static void openNotification(AndroidDriver<AndroidElement> driver) {
		driver.openNotifications();
	}

	/**
	 * Run the app in background for specified duration of time
	 * @param driver
	 */
	public static void runAppInBackground(AndroidDriver<AndroidElement> driver, int timeInSeconds) {
		driver.runAppInBackground(Duration.ofSeconds(timeInSeconds));
	}

}
