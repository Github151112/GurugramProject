package genericlib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest implements IAutoConstant {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void toConnectWithServer()
	{
		Reporter.log("to connect with the server",true);
	}
	
	@BeforeTest
	public void toConnectWithDatabase()
	{
		Reporter.log("to connect with the database",true);
	}
	
	@BeforeClass
	public void setUp() throws IOException
	{
		FLib lib = new FLib();
		String browser = lib.getDataFromPropertyFile(PROP_PATH, "browser");
		String url = lib.getDataFromPropertyFile(PROP_PATH, "url");
		Reporter.log("=======Launching"+browser+"Browser============",true);
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equals("edge"))
			driver = new EdgeDriver();
		else 
			Reporter.log("Invalid Browser",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterTest
	public void tocloseDatabase()
	{
		Reporter.log("to close the database",true);
	}
	
	@AfterSuite
	public void tocloseServer()
	{
		Reporter.log("to close the server",true);
	}

	
	
	
	
}
