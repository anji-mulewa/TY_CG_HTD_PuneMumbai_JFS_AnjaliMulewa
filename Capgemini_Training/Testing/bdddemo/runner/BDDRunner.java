package com.capgemini.bdddemo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features" , glue={"com.capgemini.stepdefinition"})
public class BDDRunner  {

}
