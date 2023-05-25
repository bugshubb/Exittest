package com.locators;

import org.openqa.selenium.By;

public class Animation 
{
	//Animation X-Path
	public static By Animation=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");

	//Animation_Layoutanimation X-Path
	public static By LayoutAnimation=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]");

	//Animation_AddButton ID
	public static By Addbutton=By.id("com.hmh.api:id/addNewButton");

	//Animation_CustomAnimation ID
	public static By CustomAnimation=By.id("com.hmh.api:id/customAnimCB");

}
