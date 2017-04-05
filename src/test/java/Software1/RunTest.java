package Software1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resourses\\Register.feature")

//        format ={ "pretty", "html:target\\html", "json:target/.json"})




public class RunTest
{
}
