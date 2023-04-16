package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_05 {

	public static void main(String[] args) throws InterruptedException {
		//Identify xpath
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
         driver.manage().window().maximize();
         
         //Identify absolute x-path-username field
         WebElement txt_xpath=driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input"));
         txt_xpath.sendKeys("Harshali Neve");
         	
         //Identify relative x-path-password field
         WebElement txt_pass=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input"));
         txt_pass.sendKeys("123456");
         Thread.sleep(3000);
         
         
         //x-path by attribute-click on login button fb
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         WebElement btn_login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
         btn_login.click();
         Thread.sleep(3000);
         String title=driver.getTitle();
         System.out.println(title);
         
         //x-path by text-forgotten button in fb
         WebElement btn_forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
         btn_forgot.click();
         Thread.sleep(3000);
         driver.close();
         
	}

}
