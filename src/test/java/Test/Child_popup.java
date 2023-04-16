package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_popup {

	public static void main(String[] args) {
		// TO Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//here to get parentpopup address
		String parentwindowAdd=driver.getWindowHandle();
		System.out.println(parentwindowAdd);
		
		//identify webelement -->click here
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		//child window handle here
		Set<String> AllAddress=driver.getWindowHandles();
        System.out.println(AllAddress);
        
        Iterator<String> it= AllAddress.iterator();
        while(it.hasNext()){
        	String childwindowaddress=it.next();
        	if(!parentwindowAdd.equals(childwindowaddress)) {
        		driver.switchTo().window(childwindowaddress);
        		
        		//identify webelement present on childwindow
        		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
        		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        		driver.close();
        	}
        }
        driver.switchTo().window(parentwindowAdd);
        driver.close();
	}

}
