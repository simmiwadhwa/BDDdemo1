package Runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/posts.feature"},glue = {"Steps"}
                 // plugin={"pretty","html:target/HTMLReports"})
               // plugin={"pretty","html:target/report.json"},tags="@SmokeTest")
               // plugin={"pretty","html:target/report.xml"}
        )
public class PostRunner{

}
