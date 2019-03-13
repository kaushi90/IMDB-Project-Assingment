package framwork.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtility {
    public static WebDriver OpenBrowser(WebDriver driver,String browserName,String url) throws InterruptedException
    {
      if(browserName.equals("Chrome"))
      {
          System.setProperty("webdriver.chrome.driver","D:\\Automation\\testframwork\\drivers\\chrome");
          driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get(url);
          Thread.sleep(5000);
          return driver;
      }
      else if(browserName.equals("Firefox"))
      {
          System.setProperty("webdriver.gecko.driver","D:\\Automation\\testframwork\\drivers\\firefox");
          driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get(url);
          Thread.sleep(5000);
          return driver;

      }
      else
      {
          return null;
      }

    }

}
