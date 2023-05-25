package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Appium_driver 
{

	public static Logger Log=Logger.getLogger(Appium_driver.class);
	public static  AppiumDriver<MobileElement> driver;
	private static DesiredCapabilities capabilties = new DesiredCapabilities();

	public void launchAndInstallApp() throws MalformedURLException
	{
		Appium_driver obj=new Appium_driver();
		obj.setAndroidCapabilities();
		driver=obj.getAndroidDriver();
	}

	public void setAndroidCapabilities()  //desired capabilites for our device device
	{
		capabilties.setCapability("appium-version", AppiumData.getProperty("versionAppium"));
		capabilties.setCapability("platformVersion", AppiumData.getProperty("Androidversion"));
		capabilties.setCapability("platformName", AppiumData.getProperty("pltfrmName"));
		capabilties.setCapability("appPackage", AppiumData.getProperty("packageofapp"));
		capabilties.setCapability("appActivity",AppiumData.getProperty("activityofapp"));
		capabilties.setCapability("app",AppiumData.getProperty("PathofApp"));
		capabilties.setCapability("deviceName", AppiumData.getProperty("NameofDevice"));
	}
	public AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException // Intializing the Appium_driver Driver

	{
		try
		{
			driver = new AndroidDriver(new URL(AppiumData.getProperty("HostPort")), capabilties);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} 
		catch (Exception e) 

		{
			e.printStackTrace();
		}

		return driver;
	}

	// Reading The TestData File From Resources Folder and Using That Data in code

	static FileInputStream readfile=null;                     
	protected static Properties AppiumData=new Properties();

	static
	{
		try
		{
			File Appiumfile=new File("./Resources/TestData.properties");
			readfile=new FileInputStream(Appiumfile);
		}
		catch(FileNotFoundException not)
		{
			not.printStackTrace();
		}
		try
		{
			AppiumData.load(readfile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
