package com.stepdefination;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.App;
import com.utilities.Appium_driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppStepdef extends Appium_driver{

	@When("user clicks on App")
	public void user_clicks_on_app() throws InterruptedException {
		Log.info("user on App");
		driver.findElement(App.App).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(App.App));

	}

	@When("user clicks Action Bar")
	public void user_clicks_action_bar() throws InterruptedException {
		Log.info("user on Action Bar");	
		driver.findElement(App.Actionbar).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(App.Actionbar));

	}

	@When("user clicks Display option")
	public void user_clicks_Display_option() throws InterruptedException {
		Log.info("user on Display option");
		driver.findElement(App.Display).click();
	}

	@Then("user Verify Display_show_title")
	public void user_Verify_Display_show_title() throws InterruptedException {
		Log.info("User click on Display_show_title and moves on");
		driver.findElement(App.Showtell).click();


	}

}
