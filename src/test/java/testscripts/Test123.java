package testscripts;

import org.openqa.selenium.WebDriver;

import generals.Baseclass;
import generals.FetchProperties;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import pages.Selenium;

/**
 * Unit test for simple App.
 */
public class Test123 extends Baseclass
{
 public static WebDriver driver;
	@org.testng.annotations.Test
  public void execscript()
  {
	 initializeBrowser();
	 loadApplication();
	 clickElement(selenium.link_selenium);
	 driver.close();
  }
}
