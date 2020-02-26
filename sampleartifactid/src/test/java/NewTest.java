/*
 * import java.io.FileInputStream; import java.io.FileNotFoundException; import
 * java.io.IOException;
 * 
 * import org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook; import
 * org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot;
 * import org.openqa.selenium.WebDriverException; import
 * org.openqa.selenium.interactions.Actions; import org.testng.annotations.Test;
 * 
 * public class NewTest {
 * 
 * @Test public void f() throws IOException {
 * 
 * 
 * //TakesScreenshot ss new TakesScreenshot() { / //public <X> X
 * getScreenshotAs(OutputType<X> target) throws WebDriverException { //// //
 * TODO Auto-generated method stub return null; } //};
 * 
 * FileInputStream fis = new FileInputStream(
 * "C:\\Users\\DELL\\eclipse-workspace\\sampleartifactid\\testdata\\sampletestdata.xlsx"
 * );
 * 
 * XSSFWorkbook workbook = new XSSFWorkbook(fis); XSSFSheet
 * sheet=workbook.getSheet("Sheet1"); int sa=sheet.getLastRowNum(); for (int
 * i=0;i<sa;i++) {
 * 
 * System.out.println(sheet.getRow(i).getCell(2).getStringCellValue()); } } }
 */