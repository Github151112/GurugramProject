package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.FLib;
import pompages.LoginPage;

public class ValidLoginTest extends BaseTest {

	@Test(description = "verify the user is able to login with valid credentials or not")
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		FLib lib = new FLib();
		String username = lib.getDataFromExcel(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = lib.getDataFromExcel(EXCEL_PATH, SHEET_NAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActititme(username, password);
	}

}
