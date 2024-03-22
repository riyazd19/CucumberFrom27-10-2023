package readingDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String excelFilePath = ".\\dataFiles\\countries.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(excelFilePath);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		// method one using for loop
		int noOfRowsSheets = sheet.getLastRowNum();

		int cols = sheet.getRow(1).getLastCellNum();

		for (int r = 0; r <= noOfRowsSheets; r++) {

			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.getCell(c);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" ");

			}
			System.out.println();
		}

	}

}
