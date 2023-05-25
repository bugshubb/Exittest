package com.runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features ={"src\\test\\java\\Feature"},
		glue="com.stepdefination",
		dryRun=false,
		tags = "@Os_Page",
		plugin= {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish= true)

@Test

public class Testrunner extends AbstractTestNGCucumberTests {

}



