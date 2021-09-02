package com.android.capabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	
	public static AndroidDriver<AndroidElement> capabalities() throws Throwable {
		//File file=new File("./ApiDemos-debug (2).apk");
		URL url=new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nithesh_Emulator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		//cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		AndroidDriver<AndroidElement> driver=
				new AndroidDriver<AndroidElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
