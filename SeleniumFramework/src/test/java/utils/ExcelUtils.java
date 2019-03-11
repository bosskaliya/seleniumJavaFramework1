package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String cellData=null;
	
	public ExcelUtils(String excelPath, String sheetName) {

		
		try {
		String projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}

		
	}

	public static void main(String[] args) {
		getRowCount();
		getColumnCount();
		getCellDataString(0,0);
		getCellDataNumber(0,0);
	}

	public static int getRowCount() {
		int rowCount = 0;

		try {
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows is "+ rowCount);


		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
		
	}
	
	
	public static int getColumnCount() {
		int colCount = 0;

		try {
			
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("Number of columns is " + colCount);


		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}
	

	public static String getCellDataString(int i, int j) {
		try {
			
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");

			cellData = sheet.getRow(i).getCell(j).getStringCellValue();
			//System.out.println("This is data from string cell: " + cellData);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	

	}

	public static void getCellDataNumber(int i, int j) {
		try {
			
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");

			cellData = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println("This is data from number cell: " +cellData);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}



}
