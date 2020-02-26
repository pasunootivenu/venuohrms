package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void f() throws IOException {
	  FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\testdata\\sampletestdata.xlsx");
	
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	  XSSFSheet Sheet =workbook.getSheet("Sheet1");
		for (int i=0;i<=Sheet.getLastRowNum();i++){
			System.out.println(Sheet.getRow(i).getCell(2).getStringCellValue());
	  
  }
}
}