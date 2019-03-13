package framwork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
    WebDriver driver=null;

    By movieTime=By.xpath(".//li[@id='navTitleMenu']");
    By topRateMovies=By.xpath("//*[@id='titleMenuImageSecondaryClick']");
    By signin=By.xpath("//a[@id='imdb-signin-link']");

    public Home(WebDriver driver){
        this.driver=driver;

    }
    public void movieTimes()
    {
        Actions action = new Actions(this.driver);
        action.moveToElement(driver.findElement(movieTime));
    }

    public void TopRabkLink()
    {
        driver.findElement(topRateMovies).click();
    }
    public void SingUp()
    {
        driver.findElement(signin).click();
    }
}
