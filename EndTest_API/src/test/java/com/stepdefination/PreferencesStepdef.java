package com.stepdefination;

import java.io.IOException;

import com.locators.Preferences;
import com.utilities.Appium_driver;
import com.utilities.SwipesAndScroll;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreferencesStepdef extends Appium_driver {


	@When("user clicks on preferences")
	public void user_clicks_on_preferences() throws InterruptedException {
		Log.info("user on preferences");
		driver.findElement(Preferences.Preferences).click();
	}

	@Then("user clicks Fragments")
	public void user_clicks_fragments() throws InterruptedException {
		Log.info("user on Fragments");
		driver.findElement(Preferences.Fragements).click();

	}

	@When("user clicks on list prefernces")
	public void user_clicks_on_list_prefernces() throws InterruptedException {
		Log.info("User on Checkbox preferences");
		driver.findElement(Preferences.Listpreferneces).click();
	}

	@Then("user Verify Alpha Option")
	public void user_Verify_Alpha_Option() throws InterruptedException {
		Log.info("User click on Alpha Option and moves on");
		driver.findElement(Preferences.Alpha).click();
		SwipesAndScroll.verticalswipeByPercentage(0.70,0.10,0.30);
	}

	@When("user clicks edit text preferences")
	public void user_clicks_edit_text_preferences() throws InterruptedException {
		Log.info("user on preferences");
		driver.findElement(Preferences.edittext).click();
	}

	@When("user provides name {string}")
	public void user_provides_name(String text) throws IOException, InterruptedException {
		Log.info("User Provides his Text"+ text);
		driver.findElement(Preferences.favoriteanimal).sendKeys(text);
	}

	@Then("user clicks on ok button and moves on")
	public void user_clicks_on_ok_button_and_moves_on() throws InterruptedException {
		Log.info("User on ok button");
		driver.findElement(Preferences.ok).click();

	}

}
