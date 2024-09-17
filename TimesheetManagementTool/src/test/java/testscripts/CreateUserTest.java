package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.FLib;
import genericlib.WorkLIb;
import pompages.CreateNewUserPage;
import pompages.HomePage;
import pompages.LoginPage;
import pompages.UserList;

public class CreateUserTest extends BaseTest {

	@Test(groups = "RT")
	public void createNewUser() throws EncryptedDocumentException, IOException, InterruptedException {
		
		//login
		FLib lib = new FLib();
		WorkLIb w = new WorkLIb();
		String username = lib.getDataFromExcel(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = lib.getDataFromExcel(EXCEL_PATH, SHEET_NAME, 1, 1);
		String username1 = lib.getDataFromExcel(EXCEL_PATH, USERDATASHEET, 1, 0)+w.getRandomNo();
		String password1 = lib.getDataFromExcel(EXCEL_PATH, USERDATASHEET, 1, 1);
		String fn = lib.getDataFromExcel(EXCEL_PATH, USERDATASHEET, 1, 2)+w.getRandomNo();
		String ln = lib.getDataFromExcel(EXCEL_PATH, USERDATASHEET, 1, 3)+w.getRandomNo();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActititme(username, password);
		
		//click on user link
		HomePage hp = new HomePage(driver);
		hp.clickOnUserLink();
		
		//click on createNewUserButton
		UserList up = new UserList(driver);
		up.clickOnCreateNewUserButton();
		
		//create user
		CreateNewUserPage cnup = new CreateNewUserPage(driver);
		cnup.createNewUser(username1, password1, fn, ln);
		
		

	}
}