package exelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.mysql.cj.result.Row;
import com.mysql.cj.xdevapi.Column;

public class readingTest {
  @Test
  public void f() throws IOException {
	  String filepath=System.getProperty("C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\testdata\\usercredentials.xlsx");
	  String sheetname="sheet1";
	  File f= new File(filepath);
	  FileInputStream is =new FileInputStream(filepath);
      Workbook wb= null;
      Sheet sh= null;
      Row row=null;
      Cell cell= null;
      if(filepath.endsWith(".xls"))
      wb=new HSSFWorkbook(is);
      else if (filepath.endsWith(".xlsx"))
     wb=new  XSSFWorkbook(is);
      sh=wb.getSheet("sheet1");
      //System.out.println(sh.getRowSumsBelow);
 
      
      
     
      
  }
}
