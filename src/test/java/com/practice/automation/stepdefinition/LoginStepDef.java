package com.practice.automation.stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDef {

	@Given("^User logins into the application$")
	public void loginApplication(){
		Assert.assertTrue(true);
	}
	
	@Then("^validate login is successfull$")
	public void loginSuccessful(){
		Assert.assertTrue(true);
	}
}
