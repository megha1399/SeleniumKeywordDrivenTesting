package TestClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeywordsUtility {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public static void setExcel(String path, int sheetNum) throws IOException {
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		wb = new XSSFWorkbook(inputStream);
		sheet = wb.getSheetAt(sheetNum);
	}
	
	public static String getData(int row, int col)  {
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
