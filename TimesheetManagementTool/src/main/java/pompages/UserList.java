package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserList extends BaseClass{

	public UserList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="//input[@value='Create New User']")
	private WebElement createNewUserButton;

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}
	
	public void clickOnCreateNewUserButton()
	{
		createNewUserButton.click();
	}
	
}
