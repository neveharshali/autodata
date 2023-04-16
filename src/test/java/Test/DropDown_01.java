package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_01 {

	public static void main(String[] args) throws Exception {
		// TO open browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel=new Select(drp_country);
		System.out.println(sel.getFirstSelectedOption().getText());
		
		//selectByIndex
		sel.selectByIndex(12);//Australia
		Thread.sleep(5000);
		
		//selectByValue
		sel.selectByValue("INDIA");
		Thread.sleep(5000);
		
		//selectByVisibleText
		sel.selectByVisibleText("BHUTAN");
		Thread.sleep(5000);
		
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			String text=list.get(i).getText();
			System.out.println(text);
			if(text.equals("RUSSIA")) {
				sel.selectByVisibleText("RUSSIA");
				break;
			}
		}
		
		
     driver.close();
	}

}
