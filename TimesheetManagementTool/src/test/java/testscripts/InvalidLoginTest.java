package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.CustomListener;
import genericlib.FLib;
import pompages.LoginPage;

@Listeners(CustomListener.class)
public class InvalidLoginTest extends BaseTest{
	
	@Test(groups = "FT")
	public void invalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FLib lib = new FLib();
		int row = lib.getRowCount(EXCEL_PATH, INVALID_SHEET);
		
		for(int i=1;i<row;i++)
		{
			String username = lib.getDataFromExcel(EXCEL_PATH, INVALID_SHEET, i, 0);
			String password = lib.getDataFromExcel(EXCEL_PATH, INVALID_SHEET, i, 1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLoginIntoActititme(username, password);
		}
		
		
		
		
	}
	
	
	

}
