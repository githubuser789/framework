package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generals.Baseclass;

public class Selenium extends Baseclass
{
 WebDriver driver;
public Selenium(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
	
@FindBy (linkText="Selenium")
public WebElement link_selenium;

public void clickSelenium()
{
	link_selenium.click();
	
}
}
