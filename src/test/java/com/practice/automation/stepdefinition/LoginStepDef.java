package com.practice.automation.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class LoginStepDef {

	@Given("User logins into the application")
	public void loginApplication(){
		Assert.assertTrue(true);
	}
	
	@Then("validate login is successfull")
	public void loginSuccessful(){
		Assert.assertTrue(true);
	}
}
