package generals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Baseclass extends Pageloader
{

	public static WebDriver driver;
	static Properties properties=new Properties();
	
	
	public static void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JamalpuC\\Downloads\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	public static String loadApplication()
	{
		String url=null;
		FileInputStream inputs=null;
		try
		{
		//	FileInputStream inputs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\configure.parameters");
			String filename = "configure.parameters";
    		inputs = (FileInputStream) Baseclass.class.getClassLoader().getResourceAsStream(filename);
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
	
	public void clickElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
