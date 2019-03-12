package generals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Selenium;

public class Pageloader
{
public Selenium selenium=null;
public void loadpages(WebDriver driver)
{
try
{
	selenium=PageFactory.initElements(driver, Selenium.class);
}
catch(Exception e)
{
	e.printStackTrace();
}

}
}
