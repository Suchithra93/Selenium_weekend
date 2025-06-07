package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDataFromExcel(String sheetname, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}

	public double getNumberDataFromExcel(String sheetname, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}

	public boolean getBooleanDataFromExcel(String sheetname, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}

	public LocalDateTime getDataFromExcel(String sheetname, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	}

}
