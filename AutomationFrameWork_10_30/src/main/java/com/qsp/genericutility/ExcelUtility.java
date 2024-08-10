package com.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDataFromExcel(String sheetName, int RowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScript.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(RowIndex).getCell(colIndex).getStringCellValue();

	}
	public double getNumberDataFromExcel(String sheetName, int RowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScript.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(RowIndex).getCell(colIndex).getNumericCellValue();
		
	}
	public boolean getBooleanDataFromExcel(String sheetName, int RowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScript.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(RowIndex).getCell(colIndex).getBooleanCellValue();
	}
	
}