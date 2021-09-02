package com.android.draganddrop;

import java.time.Duration;

import com.android.capabilities.Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDropTest extends Base{

	public static void main(String[] args) throws Throwable {

		AndroidDriver<AndroidElement> driver=capabalities();
		driver.findElementByXPath("//*[@text='Views']").click();
		driver.findElementByXPath("//*[@text='Drag and Drop']").click();
		AndroidElement dot1=driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		AndroidElement dot2=driver.findElementById("io.appium.android.apis:id/drag_dot_2");

		dragAndDrop(driver, dot1, dot2);
		
		String dropText=driver.findElementById("io.appium.android.apis:id/drag_result_text").getText();
		System.out.println(dropText);
		driver.runAppInBackground(Duration.ofSeconds(5));
	}

	/**
	 * Use this method to perform Drag and Drop
	 * @param driver
	 * @param sourceElement
	 * @param targetElement
	 */
	public static void dragAndDrop(AndroidDriver<AndroidElement> driver, AndroidElement sourceElement,
			AndroidElement targetElement) {
		TouchAction touch=new TouchAction(driver);
		touch.longPress(LongPressOptions.longPressOptions()
				.withElement(ElementOption.element(sourceElement))
				.withDuration(Duration.ofSeconds(1)))
		.moveTo(ElementOption.element(targetElement)).release().perform();
	}

}
