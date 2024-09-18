package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class WorkignWithSoftAssert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-eeas1cv9/login.do");

		SoftAssert a = new SoftAssert();
		a.assertEquals(driver.getTitle(), "actiTIME - Logi", "Login page displayed");
		
		WebElement username = driver.findElement(By.name("username"));
		Assert.assertEquals(username.isEnabled(), "false");
		username.sendKeys("admin");
		
		
		a.assertAll();

	}

}
