package Software1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mehul on 14/02/2017.
 */
public class Utility extends DriverManager
{
  public static void enterText (WebElement element , String text)
  {
      element.sendKeys(text);
  }
  public static void clickOnElement (WebElement element)
  {
      element.click();
  }

  public static void selectByVisibleText (WebElement element , String text )
  {
      Select select = new Select(element);
      select.selectByVisibleText(text);
  }

  public static String randomDate ()
  {
      SimpleDateFormat formet = new SimpleDateFormat("ddmmyyHHmmss");
      return formet.format(new Date());
  }


}
