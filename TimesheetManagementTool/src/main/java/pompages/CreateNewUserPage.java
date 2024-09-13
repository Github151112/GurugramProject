package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage extends BaseClass{

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(name = "username")
	private WebElement newUsernameTextField;
	
	@FindBy(name = "passwordText")
	private WebElement newPasswordTextField;
	
	@FindBy(name = "passwordTextRetype")
	private WebElement retypePasswordTextField;
	
	@FindBy(name = "firstName")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath ="//input[contains(@value,'Create User')]")
	private WebElement createUserButton;

	public WebElement getNewUsernameTextField() {
		return newUsernameTextField;
	}

	public WebElement getNewPasswordTextField() {
		return newPasswordTextField;
	}

	public WebElement getRetypePasswordTextField() {
		return retypePasswordTextField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	public void createNewUser(String username,String password,String fn,String ln) throws InterruptedException
	{
		newUsernameTextField.sendKeys(username);
		newPasswordTextField.sendKeys(password);
		retypePasswordTextField.sendKeys(password);
		firstNameTextField.sendKeys(fn);
		lastNameTextField.sendKeys(ln);
		createUserButton.click();
		
	}
	
	
	

}
