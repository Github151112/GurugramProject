package DataProvider;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {

	@DataProvider(name = "TestData")
	public Object[][] loginTestData() {
		Object[][] o = new Object[5][2];
		o[0][0] = "sccadmin";
		o[0][1] = "mcsccanager";

		o[1][0] = "Aman@14kjhbvgk8745";
		o[1][1] = "Aman@1n48745";

		o[2][0] = "Aman@kjh148745";
		o[2][1] = "Aman@,mnl148745";

		o[3][0] = "Aman@hgcfkv148745";
		o[3][1] = "Aman@148745";

		o[4][0] = "Aman@kjbhljh148745";
		o[4][1] = "Amanjhgfitfg@148745";
		
		return o;

	}

	@Test(dataProvider = "TestData")
	public void loginIntoActitime(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-eeas1cv9/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		driver.quit();
	}
}
