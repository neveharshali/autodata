package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_08 {

	public static void main(String[] args) throws InterruptedException {
				// 1.open Browser to go url"https://www.google.com/" 
				//2.serch bar -->maven
				//3.Autosuggestion element identify
				//4.suggestion --->click 2 option
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
        Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().equals("maven dependency")) {
        		list.get(i).click();
        		break;
        	}
        }
        Thread.sleep(5000);
        
       //System.out.println(list.get(2).getText());
        //list.get(2).click();
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      driver.close();
	}

}
