package com.android.keyboard;



import com.android.capabilities.Base;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class MultipleTaps extends Base{

	public static void main(String[] args) throws Throwable {
		AndroidDriver<AndroidElement> driver = capabalities();
		driver.findElementByXPath("//*[@text='Views']").click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		        ".scrollIntoView(new UiSelector().text(\"TextSwitcher\"))"));
		driver.findElementByXPath("//*[@text='TextSwitcher']").click();
		AndroidElement nextButton = driver.findElementById("io.appium.android.apis:id/next");
		multipleTapOnElement(driver, nextButton, 5);
		String noOfTaps = driver.findElementByXPath("//android.widget.TextView[@text]").getText();
		System.out.println("Total taps: "+noOfTaps);
		driver.closeApp();
	}

	/**
	 * @param driver
	 * @param element
	 */
	public static void multipleTapOnElement(AndroidDriver<AndroidElement> driver, AndroidElement element, int taps) {
		TouchAction touch=new TouchAction(driver);
		touch.tap(TapOptions.tapOptions()
				.withElement(ElementOption.element(element)).withTapsCount(taps)).perform();
	}

}
