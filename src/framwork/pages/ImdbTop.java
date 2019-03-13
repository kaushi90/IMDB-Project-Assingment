package framwork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbTop {
    WebDriver driver=null;
    By topRateTv=By.xpath("//a[@href='/chart/toptv?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=4da9d9a5-d299-43f2-9c53-f0efa18182cd&pf_rd_r=SE2CQZQPTNKG332MQVH3&pf_rd_s=right-4&pf_rd_t=15506&pf_rd_i=top&ref_=chttp_ql_6']\n" +
            "\n");
    By gameOfThrones=By.xpath("\n" +
            "//a[@title='Emilia Clarke, Peter Dinklage']");

    public ImdbTop(WebDriver driver){
        this.driver=driver;

    }
    public void getTopRateTv()
    {
      driver.findElement(topRateTv).click();
    }

    public void goToGameOfThrones()
    {
        driver.findElement(gameOfThrones).click();
    }

}
