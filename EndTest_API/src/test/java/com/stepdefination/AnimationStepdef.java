package com.stepdefination;

import java.net.MalformedURLException;

import com.locators.Animation;
import com.utilities.Appium_driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnimationStepdef extends Appium_driver {

	@Given("API Demo app is Launched")
	public void api_demo_app_is_launched() throws MalformedURLException {

		Log.info("The App is Launched");
		launchAndInstallApp();
	}

	@When("user clicks on animation")
	public void user_clicks_on_animation() throws InterruptedException
	{	
		Log.info("user on animation");
		driver.findElement(Animation.Animation).click();

	}

	@When("user clicks on Layout animation")
	public void user_clicks_on_Layout_animation() throws InterruptedException
	{
		Log.info("user on Layout animation");
		driver.findElement(Animation.LayoutAnimation).click();


	}

	@Then("user verify on Add button")
	public void user_verify_on_Add_button() throws InterruptedException 
	{

		Log.info("user verify on Add button and moves on");
		driver.findElement(Animation.Addbutton).click();


	}

	@Then("user verify on Custom Animation")
	public void user_verify_on_Custom_Animation() throws InterruptedException 
	{

		Log.info("User click on Custom Animation and moves on");
		driver.findElement(Animation.CustomAnimation).click();



	}




}
