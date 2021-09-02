package com.android.touch.action;

import java.time.Duration;

import com.android.capabilities.Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TapOnElement extends Base{

	public static void main(String[] args) throws Throwable {
		AndroidDriver<AndroidElement> driver = capabalities();
		driver.findElementByXPath("//*[@text='Views']").click();
		AndroidElement expandList = driver.findElementByXPath("//*[@text='Expandable Lists']");
		tapOnElement(driver, expandList);
		System.out.println("tapped on elemenet==>>"+ expandList.toString());
		driver.findElementByXPath("//*[@text='1. Custom Adapter']").click();
		AndroidElement peoples = driver.findElementByXPath("//*[@text='People Names']");
		longPressOnElement(driver, peoples, 2);
		String popUpText=driver.findElementsById("android:id/title").get(0).getText();
		System.out.println(popUpText);

		driver.closeApp();
	}
	/**
	 * Use the method for longPress on element for specific duration fo time
	 * @param driver
	 * @param element
	 */
	public static void longPressOnElement(AndroidDriver<AndroidElement> driver, AndroidElement element, int timeInSeconds) {
		TouchAction touch=new TouchAction(driver);
		touch.longPress(LongPressOptions.longPressOptions()
				.withElement(ElementOption.element(element))
				.withDuration(Duration.ofSeconds(timeInSeconds)))
		.release().perform();
	}
	/**
	 * Use the method perform tap on element
	 * @param driver
	 * @param element
	 */
	private static void tapOnElement(AndroidDriver<AndroidElement> driver, AndroidElement element) {
		TouchAction touch=new TouchAction(driver);
		touch.tap(TapOptions.tapOptions()
				.withElement(ElementOption.element(element))).perform();
	}
}
