package framwork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Register {
    WebDriver driver=null;
    WebDriverWait wait;
    SoftAssert soft = new SoftAssert(); //use soft assets here
    By accountcreation=By.xpath("//a[@class='list-group-item create-account ']");
    By name=By.xpath("\n" +
            "//input[@id='ap_customer_name']]");
    By email=By.xpath("//input[@id='ap_email']");
    By password=By.xpath("//input[@id='ap_password']");
    By reenterpwd=By.xpath("//input[@id='ap_password_check']");
    By submitbtn=By.xpath("//input[@type='submit']");
    By verifyLogin=By.xpath("//a[@id='nbusername']");
    public Register(WebDriver driver){
        this.driver=driver;

    }
    public void clickAccountCreateBtn()
    {
        driver.findElement(accountcreation).click();
    }

    public void entername(String yourname)
    {
        driver.findElement(name).sendKeys(yourname);
    }
    public void enteremail(String emailId)
    {
        driver.findElement(email).sendKeys(emailId);
    }
    public void enterPassword(String pwd)
    {
        driver.findElement(password).sendKeys(pwd);
    }
    public void reEnterPassword(String pwd)
    {
        driver.findElement(reenterpwd).sendKeys(pwd);
    }
    public void submitRegistation()
    {
        driver.findElement(submitbtn).click();
    }
    public boolean LoginVerification()
    {

        wait.until(ExpectedConditions.visibilityOfElementLocated(verifyLogin));
        Boolean result=false;
        soft.assertEquals(driver.findElement(verifyLogin).isDisplayed(),"true");
        soft.assertAll();
        return result;

    }

}
