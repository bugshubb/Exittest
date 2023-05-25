package com.stepdefination;

import com.utilities.Appium_driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;

public class Hooks extends Appium_driver
{
	public static AppiumDriver<MobileElement> driver;

	@After(order = 0)
	public void afterScenari()
	{
		//Appium_driver.driver.close();
		Appium_driver.driver.quit();

	}


}