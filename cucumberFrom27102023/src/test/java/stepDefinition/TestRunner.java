package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepDefinition"},
monochrome=true,
plugin={"pretty","html:/target/HtmlReports"})
public class TestRunner {

}

