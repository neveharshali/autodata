package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_sheet_01 {

	public static void main(String[] args) throws Exception {
		//Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//identify xpath using webelement
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		
		// how to fetch excel sheet data
		String path="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\Testdata\\data.xlsx";
        FileInputStream fis =new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        
        //fetch string record from excel
       String data_1= wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
       System.out.println(data_1);
       
       String data_2=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
       System.out.println(data_2);
       
      String data_3= wb.getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
      System.out.println(data_3);
      
      String data_4=wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
     System.out.println(data_4);
     
     String data_5=wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
     System.out.println(data_5);
     
     //sending data excel to webelement
     txt_email.sendKeys(data_4);
     txt_password.sendKeys(data_5);
     
      //fetch numeric record from excel
     double data_6=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();//0--3 ->123456
     System.out.println(data_6);//123456.0
     
     //convert double value in string(numeric)
    String data_6_s=String.valueOf(data_6);
    String data=data_6_s.replace(".0", "");
    System.out.println(data);
     
     
      
      
      }

}
