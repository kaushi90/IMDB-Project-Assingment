package framwork.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "features/ValidateGameOfThrones.feature",
        glue = {"ValidateGameOfThrones","RegisterInIMDb"},
        tags = {"@ValidateMovie","@Register"},
        plugin = {"pretty","html:target/cucumber-reports/advance-reports","json:target/cucumber-reports/CucumberTestReport.json"},

        monochrome = true)
public class TestRunnerCucumber {
      private TestNGCucumberRunner testNGCucumberRunner;
      @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception
      {
          testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
      }
      @Test(dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature)
      {
          testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
      }

      @DataProvider(name="features")
    public Object[][] feature() throws Exception
      {
        return testNGCucumberRunner.provideFeatures();
      }

      @AfterClass(alwaysRun = true)
    public void tearDwnClass()
      {
          testNGCucumberRunner.finish();
      }



}
