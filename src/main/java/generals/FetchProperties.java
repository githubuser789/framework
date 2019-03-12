package generals;

import java.io.FileInputStream;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FetchProperties 
{
	static WebDriver driver;
	static Properties properties=new Properties();
public static void retrieveProperties()
{
	try {
		
		FileInputStream inputs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\configure.parameters");
		properties.load(inputs);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void FetchProperties(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public static String loadApplication()
{
	String url=null;
	try
	{
		FileInputStream inputs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\configure.parameters");
		properties.load(inputs);
	 url= properties.getProperty("URL");
	 driver.get(url);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return url;
	
}
}
