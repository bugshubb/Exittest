package com.locators;

import org.openqa.selenium.By;

public class Preferences 
{
	//Preferences X-Path
	public static By Preferences=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]");

	//Preferences_Fragements X-Path
	public static By Fragements=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]");

	//Preferences_Listpreferences X-Path
	public static By Listpreferneces=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/"
			+ "android.widget.LinearLayout[5]/android.widget.RelativeLayout\r\n");

	//Preferences_Alpha X-Path
	public static By Alpha=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/"
			+ "android.widget.CheckedTextView[1]\r\n");

	//Preferences_edittext X-Path
	public static By edittext=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout\r\n");

	//Preferences_favoruteanimal ID
	public static By favoriteanimal=By.id("android:id/edit");

	//Preferences_Ok X-Path
	public static By ok=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/"
			+ "android.widget.LinearLayout/android.widget.Button[2]\r\n");
}


