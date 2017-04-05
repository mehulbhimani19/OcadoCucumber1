package Software1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 14/02/2017.
 */
public class DriverManager
{
    protected static WebDriver driver;

    public DriverManager ()
    {
        PageFactory.initElements(driver, this);

    }

    public static void openBrowser ()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ocado.com");
        driver.manage().deleteAllCookies();

    }
   @AfterMethod
    public static void closeBrowser ()
    {
        driver.quit();
    }
}

