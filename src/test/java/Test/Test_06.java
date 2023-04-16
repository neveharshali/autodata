package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_06 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Webelement --> Xpath By Attributes --> //tagname[@attribute name='value']
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Harshu@gmail.com");
		
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123456");
		
		//WebElement --> Xpath by Contains --> //tagname[contains(@id,'value')]
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		btn_login.click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        
		//WebElement --> Xpath by text -->//tagname[text()='text']
		WebElement btn_forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		btn_forgot.click();
		Thread.sleep(5000);
		String title1=driver.getTitle();
		System.out.println(title1);
        String url1=driver.getCurrentUrl();
        System.out.println(url1);
		
        //WebElement --> Xpath by Contains --->//tagname[Contains(@attribute,'value')]
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement btn_create=driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		btn_create.click();
		Thread.sleep(5000);
		String title2=driver.getTitle();
		System.out.println(title2);
        String url2=driver.getCurrentUrl();
        System.out.println(url2);
       
        WebElement txt_FN=driver.findElement(By.xpath("//input[@name='firstname']"));
        txt_FN.sendKeys("Harshu");
        Thread.sleep(3000);
        
       WebElement txt_LN= driver.findElement(By.xpath("//input[@name='lastname']"));
       txt_LN.sendKeys("Neve");
       Thread.sleep(3000);
       
       WebElement txt_email1=driver.findElement(By.xpath("//input[@name='reg_email__']"));
       txt_email1.sendKeys("test@gmail.com");
       Thread.sleep(3000);
       
       WebElement txt_REemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
       txt_REemail.sendKeys("test@gmail.com");
       Thread.sleep(3000);
       
       WebElement txt_pass1=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
       txt_pass1.sendKeys("123456");
       Thread.sleep(3000);
       
       WebElement btn_day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
       //btn_day.sendKeys("30");
       //btn_day.click();
       Select select=new Select(btn_day);
       select.selectByValue("30");
       Thread.sleep(5000);
       
       WebElement btn_month=driver.findElement(By.xpath("//select[@id='month']"));
       //btn_month.sendKeys("Aug");
       //btn_month.click();
       Select sel=new Select(btn_month);
       sel.selectByValue("6");
       Thread.sleep(5000);
       
       WebElement btn_year=driver.findElement(By.xpath("//select[@id='year']"));
       Select sel1=new Select(btn_year);
       sel1.selectByValue("1997");
       //btn_year.sendKeys("1997");
       //btn_year.click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//label[text()='Female']")).click();
       Thread.sleep(3000);
       WebElement btn_press=driver.findElement(By.xpath("//button[@name='websubmit']"));
       btn_press.click();
       Thread.sleep(3000);
      System.out.println( driver.getTitle());
      System.out.println(driver.getCurrentUrl());
       
		driver.close();
	}

}
