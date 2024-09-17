package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "usern")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public void loginIntoActititme(String username,String password) throws InterruptedException
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
	}
	

	public void invalidLoginIntoActititme(String username,String password) throws InterruptedException
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		usernameTextField.clear();
		
	}
	
	

}
