package com.stepdefination;


import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.locators.Os;
import com.utilities.Appium_driver;
import com.utilities.Test_Data_From_Excel;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OsStepdef extends Appium_driver{

	@When("user clicks on OS")
	public void user_clicks_on_os() throws InterruptedException {
		Log.info("user on OS");
		driver.findElement(Os.OS).click();
	}

	@Then("user clicks SMS Messaging")
	public void user_clicks_sms_messaging() throws InterruptedException {
		Log.info("user on SMS Messaging");
		driver.findElement(Os.SMS).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Os.Recipient));

	}

	@Then("user Verify Recipient")
	public void user_verify_recipient() throws InterruptedException, IOException {
		Log.info("User click on Recipient and moves on");
		driver.findElement(Os.Recipient).sendKeys(Test_Data_From_Excel.Fetch_Data_From_Sheet().getRow(0).getCell(0).getStringCellValue());
	}

	@Then("user Verify Message Body")
	public void user_verify_message_body() throws InterruptedException, IOException {
		Log.info("User click on Message and moves on");
		driver.findElement(Os.Body).sendKeys(Test_Data_From_Excel.Fetch_Data_From_Sheet().getRow(1).getCell(0).getStringCellValue());
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Os.Body));	
	}

	@Then("user Verify Send")
	public void user_verify_send() throws InterruptedException {
		Log.info("User click on Send and moves on");
		driver.findElement(Os.Sendsms).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Os.Sendsms));


	}
	@Then("message status should be {string}")
	public void message_status_should_be(String msgstatus) throws InterruptedException {

		String actualMSGStatus = driver.findElement(Os.message_status).getText();
		Assert.assertEquals(actualMSGStatus,msgstatus);

	}
}
