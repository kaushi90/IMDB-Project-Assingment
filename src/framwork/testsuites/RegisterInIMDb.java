package framwork.testsuites;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import framwork.pages.Home;
import framwork.pages.Register;
import framwork.utility.BrowserUtility;
import framwork.utility.DatabaseReader;
import framwork.utility.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.Properties;

public class RegisterInIMDb {
    PropertyFileReader prop=new PropertyFileReader();
    private WebDriver driver;
    SoftAssert soft = new SoftAssert(); //use soft assets here
    String yourname="Kanishka";
    String emailId="Kanishka.kaushi@gmail.com";
    String Password="ABC123";
    String RePassword="ABC123";
    DatabaseReader dbreader=new DatabaseReader();

    @Given("^Sing up page should be load successfully$")
    public void clickSingUp() throws Exception
    {
       new Home(driver).SingUp();
    }
    @When("^click create new account$")
    public void createNewAccount()
    {
        new Register(driver).clickAccountCreateBtn();
    }
    @When("^Enter your name$")
    public void enterName()
    {
        new Register(driver).entername(yourname);
    }
    @When("^Enter Email$")
    public void enterEmailAddress()
    {
        new Register(driver).enteremail(dbreader.readExcel("D:\\imdbProject\\DAO\\","Register","Sheet1"));
    }
    @When("^Enter Password and re enter password$")
    public void enterPassword()
    {
        new Register(driver).enterPassword(Password);
        new Register(driver).reEnterPassword(RePassword);
    }
    @When("^Enter submit button$")
    public void RegisterCustomer()
    {
        new Register(driver).submitRegistation();
    }
    @When("^validate whether login success message display correctly$")
    public void verifyRegisterUsers()
    {
        new Register(driver).LoginVerification();
    }
}
