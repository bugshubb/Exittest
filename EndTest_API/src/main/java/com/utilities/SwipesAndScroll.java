package com.utilities;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class SwipesAndScroll extends Appium_driver
{

	public static void verticalswipeByPercentage(double startpercentage,double endpercentage,double anchorpercentage)
	{
		Dimension size= driver.manage().window().getSize();
		int anchor=(int)(size.width*anchorpercentage);
		int startpoint=(int)(size.width*startpercentage);
		int endpoint=(int)(size.width*endpercentage);
		new TouchAction(driver).press(point(anchor,startpoint))
		.waitAction(waitOptions(ofMillis(1000))).moveTo(point(anchor,endpoint)).release().perform();
	}


}
