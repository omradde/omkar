package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelprogram {
	@Test
	public void test_1() throws Exception {
		String path="C:\\Users\\omkar\\eclipse-workspace\\AutomationMain\\exceldataretrive\\New Microsoft Excel Worksheet.xlsx";
		FileInputStream file =new FileInputStream(path);
		XSSFWorkbook wb =new XSSFWorkbook(file);
		String testdata=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String testdata1 =wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(testdata);
		System.out.println(testdata1);

		
	}

}
