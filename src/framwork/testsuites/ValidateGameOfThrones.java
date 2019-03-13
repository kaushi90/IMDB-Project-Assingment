package framwork.testsuites;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framwork.pages.GameOfThrones;
import framwork.pages.Home;
import framwork.pages.ImdbTop;
import framwork.utility.BrowserUtility;
import framwork.utility.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.util.Properties;

public class ValidateGameOfThrones {
    PropertyFileReader prop=new PropertyFileReader();
    private WebDriver driver;
    SoftAssert soft = new SoftAssert(); //use soft assets here

    @Given("^open chrome browser and enter URL$")
    public void getdriver() throws Exception
    {
        Properties properties=prop.getProperty();
        driver= BrowserUtility.OpenBrowser(driver,properties.getProperty("browser.nameOne"),properties.getProperty("browser.baseURL"));
        throw new PendingException();
    }
    @When("^click toprateMovies$")
    public void GotoRatings()
    {
        new Home(driver).movieTimes();
        new Home(driver).TopRabkLink();
        throw new PendingException();

    }
    @When("^Click Top rate Tvs$")
    public void GoToTopRateTv()
    {
        new ImdbTop(driver).getTopRateTv();
        throw new PendingException();
    }

    @When("^click Game of Thrones$")
    public void messageSend()
    {
        new ImdbTop(driver).goToGameOfThrones();
        throw new PendingException();
    }

    @Then("^validate GameOfThrone Image Visibility$")
    public void verifytheSuccess()
    {
        new GameOfThrones().visibility();
        throw new PendingException();

    }
    @Then("^validate PageTitle$")
    public void verifyTitle()
    {
        new GameOfThrones().getTitle();
        throw new PendingException();

    }


}
