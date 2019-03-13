package framwork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class GameOfThrones {

    WebDriver driver=null;
    WebDriverWait wait;
    SoftAssert soft = new SoftAssert(); //use soft assets here
    By gameOfThrones=By.xpath("//img[@alt='Game of Thrones Poster']");

    public boolean visibility()
    {

        wait.until(ExpectedConditions.visibilityOfElementLocated(gameOfThrones));
        Boolean result=false;
        soft.assertEquals(driver.findElement(gameOfThrones).isDisplayed(),"true");
        soft.assertAll();
        return result;

    }
    public void getTitle()
    {
        soft.assertEquals(driver.getTitle(),"Game of Thrones(Series 2011-)-IMDb");
        soft.assertAll();
    }

}
