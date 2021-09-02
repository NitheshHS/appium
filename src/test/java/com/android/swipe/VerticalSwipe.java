package com.android.swipe;

import java.util.Iterator;
import java.util.Set;

import com.android.capabilities.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class VerticalSwipe extends Base{
	
	public static void main(String[] args) throws Throwable {
		AndroidDriver<AndroidElement> driver = capabalities();
		driver.findElementByXPath("//*[@text='Views']").click();
		verticalSwipe(driver, "Lists");
		driver.findElementByXPath("//*[@text='Lists']").click();
		Set<String> contexts=driver.getContextHandles();
		Iterator<String> itr = contexts.iterator();
		String pid = itr.next();
		driver.context(pid);
		
		
	}
	

	/**
	 * perform the swipe till the mention text visible
	 * @param driver
	 */
	public static void verticalSwipe(AndroidDriver<AndroidElement> driver,String text) {
		driver.findElement(MobileBy
		.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		        ".scrollIntoView(new UiSelector().text(\""+text+"\"))"));
	}

}
