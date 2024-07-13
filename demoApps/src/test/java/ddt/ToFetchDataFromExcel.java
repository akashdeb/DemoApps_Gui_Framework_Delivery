package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Convert the physical Excel Sheet to Java Representation
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_April2024_WeekendBatch\\demoApps\\testdata\\TestScriptData.xlsx");
		//Access the workbook
		Workbook workbook = WorkbookFactory.create(fis);
		//Access the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		//Access the row 
		Row row = sheet.getRow(1);
		//Access the cell
		Cell cell = row.getCell(1);
		//Get String data
		String email = cell.getStringCellValue();

		System.out.println(email);
		//Get numeric Data
		long phoneNo = (long) row.getCell(3).getNumericCellValue();

		System.out.println(phoneNo);
		//Get boolean Data
		boolean status = row.getCell(4).getBooleanCellValue();

		System.out.println(status);
		//Get Date data
		  LocalDateTime date = row.getCell(5).getLocalDateTimeCellValue();

		System.out.println(date.toString().substring(0, 10));

	}

}
