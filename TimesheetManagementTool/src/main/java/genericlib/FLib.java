package genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FLib {
	
	
	public String getDataFromPropertyFile(String path,String key) throws IOException
	{
		FileInputStream f = new FileInputStream(path);
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key);
		
	}
	
	public String getDataFromExcel(String path,String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		return cell.getStringCellValue();
	}
	
	public int getRowCount(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getPhysicalNumberOfRows();
	}

}
