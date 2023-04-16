package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_07 {

	public static void main(String[] args) throws InterruptedException {
		// 1.open Browser to go url"flipkart" 
		//2.serch bar -->mobile
		//3.Autosuggestion element identify
		//4.suggestion --->click on 4 option
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement serch_bar=driver.findElement(By.xpath("//input[@type='text']"));
		serch_bar.sendKeys("Mobiles");
		//serch_bar.click();
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
		
        System.out.println(list.size());
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().equals("mobiles under 15000 camera phone")) {
        		list.get(i).click();
        		break;
        	}
        	
        }
        Thread.sleep(5000);
    	System.out.println(driver.getTitle());
    	driver.close();
	}

}
