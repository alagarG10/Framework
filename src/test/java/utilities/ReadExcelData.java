package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcelData {
	
	
	@DataProvider(name="AdactinTestData")
	public String[][] getData(Method m) throws IOException 
	{
		String excelSheetName = m.getName();
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet(excelSheetName);
		
		int totalRows = s.getLastRowNum();
		System.out.println(totalRows);
		Row r = s.getRow(0);
		int totalcols = r.getLastCellNum();
		System.out.println(totalcols);
		
		DataFormatter format = new DataFormatter();
		
		
		String testData[][] = new String [totalRows][totalcols];
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalcols; j++) {
				testData[i-1][j]=format.formatCellValue(s.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
				
			}
		}
		return testData;
	}
}
