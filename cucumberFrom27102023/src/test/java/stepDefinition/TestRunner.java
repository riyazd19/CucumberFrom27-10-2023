package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/features",glue= {"stepDefinition"},
 plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
monochrome=true
//,plugin= {"pretty",
	//	"json:target/MyReports/report.json"
//}
)
//plugin={"pretty","html:target/HTMLReports"}//tags="@Riya")
public class TestRunner {

}

