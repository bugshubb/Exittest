package com.locators;

import org.openqa.selenium.By;

import com.utilities.Appium_driver;

public class Os extends Appium_driver
{
	//OS X-Path
	public static By OS=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup"
			+ "/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[8]");

	//OS_SMS X-Path
	public static By SMS=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup"
			+ "/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]");

	//OS_Recipient ID
	public static By Recipient=By.id("com.hmh.api:id/sms_recipient");

	//OS_Body ID
	public static By Body=By.id("com.hmh.api:id/sms_content");

	//OS_SendSMS ID
	public static By Sendsms=By.id("com.hmh.api:id/sms_send_message");

	//OS_MessageStatus ID
	public static By message_status = By.id("com.hmh.api:id/sms_status");

}
