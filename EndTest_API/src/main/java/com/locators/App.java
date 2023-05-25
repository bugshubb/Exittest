package com.locators;

import org.openqa.selenium.By;

public class App 
{
	//App X-Path
	public static By App=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");

	//App_Actionbar X-Path
	public static By Actionbar=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup"
			+ "/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]");

	//App_Display X-Path
	public static By Display=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup"
			+ "/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]");

	//App_Showtell X-Path
	public static By Showtell=By.id("com.hmh.api:id/toggle_show_title");

}
