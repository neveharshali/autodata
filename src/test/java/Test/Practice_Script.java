package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Practice_Script {

	public static void main(String[] args) throws Exception {
		// TO Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
         //Identify webelement on webpage
        WebElement First_Name=driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement Last_Name=driver.findElement(By.xpath("//input[@name='lastName']"));
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
        WebElement txt_email=driver.findElement(By.xpath("//input[@name='userName']"));
        WebElement txt_add=driver.findElement(By.xpath("//input[@name='address1']"));
        WebElement txt_city=driver.findElement(By.xpath("//input[@name='city']"));
        WebElement txt_state=driver.findElement(By.xpath("//input[@name='state']"));
        WebElement txt_postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
        WebElement txt_username=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement txt_pass=driver.findElement(By.xpath("//input[@name='password']"));
        WebElement txt_cnfpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        WebElement btn_sbt=driver.findElement(By.xpath("//input[@name='submit']"));
        
        //copy path excel sheet
        String path="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\Testdata\\data.xlsx";
        
        //Excel Record fetch
        FileInputStream fis= new FileInputStream(path);
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        
        //fetch testdata from excel to webpage
        String data_1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        First_Name.sendKeys(data_1);
        Thread.sleep(1000);
        
        String data_2=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        Last_Name.sendKeys(data_2);
        Thread.sleep(1000);
        
        String data_3=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        phone.sendKeys(data_3);
        Thread.sleep(1000);
        
        String data_4=wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
        txt_email.sendKeys(data_4);
        txt_username.sendKeys(data_4);
        Thread.sleep(1000);
        
        String data_5=wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
        txt_add.sendKeys(data_5);
        Thread.sleep(1000);
        
        String data_6=wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
        txt_city.sendKeys(data_6);
        Thread.sleep(1000);
        
        String data_7=wb.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
        txt_state.sendKeys(data_7);
        Thread.sleep(1000);
        
        String data_8=wb.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
        txt_postalcode.sendKeys(data_8);
        Thread.sleep(1000);
        
        //DropDown handle
        WebElement drp_contry=driver.findElement(By.xpath("//select[@name='country']"));
        Select sel = new Select(drp_contry);
        sel.selectByVisibleText("INDIA");
        Thread.sleep(1000);
        
        String data_9=wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
        txt_pass.sendKeys(data_9);
        txt_cnfpass.sendKeys(data_9);
        Thread.sleep(1000);
        
        //click on submit button
        btn_sbt.click();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        
        
        //copy screen shot folder path
        String path1="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\Screenshot3";
        //multiple ss display
        //String rm=RandomString.make(5);
        //to take Screen shot
        TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File(path1+"//register.png");
        FileUtils.copyFile(src, dest);
        Thread.sleep(3000);
        WebElement txt_1=driver.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif'])[3]"));
        System.out.println(txt_1.getText());
        
        //click on signin button navigate to login page
        WebElement btn_signin=driver.findElement(By.xpath("//a[@href='login.php']"));
        btn_signin.click();
        Thread.sleep(5000);
        
        //identify webelement on login page 
        WebElement username_1=driver.findElement(By.xpath("//input[@name='userName']"));
        username_1.sendKeys(data_4);
        Thread.sleep(1000);
        WebElement pass_1=driver.findElement(By.xpath("//input[@name='password']"));
        pass_1.sendKeys(data_9);
        Thread.sleep(1000);
        
        //click on submit on loginpage
        WebElement btn_sb1=driver.findElement(By.xpath("//input[@name='submit']"));
        btn_sb1.click();
        Thread.sleep(1000);
        
        //to take screenshot
        TakesScreenshot ds=(TakesScreenshot)driver;
        File src1=ds.getScreenshotAs(OutputType.FILE);
        File dest1=new File(path1+"//login.png");
        FileUtils.copyFile(src1, dest1);
        
        System.out.println(driver.getTitle());
        
        WebElement txt=driver.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif'])[2]"));
         System.out.println(txt.getText());
        
        
        
        
        driver.close();
	}

}
