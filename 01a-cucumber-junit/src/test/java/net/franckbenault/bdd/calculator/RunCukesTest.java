package net.franckbenault.bdd.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-calculator.json","html:target/cucumber-calculator"})
public class RunCukesTest {
}