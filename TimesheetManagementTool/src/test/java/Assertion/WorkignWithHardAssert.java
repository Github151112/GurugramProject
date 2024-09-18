package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WorkignWithHardAssert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-eeas1cv9/login.do");

		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");

		driver.findElement(By.name("username")).sendKeys("admin");

	}

}
