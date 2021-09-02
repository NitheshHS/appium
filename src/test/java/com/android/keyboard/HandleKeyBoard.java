package com.android.keyboard;

import java.util.concurrent.TimeUnit;

import com.android.capabilities.Base;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HandleKeyBoard extends Base{
	public static void main(String[] args) throws Throwable {
		AndroidDriver<AndroidElement> driver=capabalities();
		driver.findElementByXPath("//*[@text='Views']").click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		        ".scrollIntoView(new UiSelector().text(\"TextFields\"))"));
		driver.findElementByXPath("//*[@text='TextFields']").click();
		AndroidElement textField=driver.findElementById("io.appium.android.apis:id/edit");
		textField.click();
		hideKeyboard(driver);
		textField.sendKeys("Hi Nithesh");
		driver.closeApp();
	}

	/**
	 * @param driver
	 */
	public static void hideKeyboard(AndroidDriver<AndroidElement> driver) {
		driver.hideKeyboard();
	}
	
	
	

}
