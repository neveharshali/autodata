package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_02 {

	public static void main(String[] args) throws InterruptedException {
		//Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();//Facebook – log in or sign up
		System.out.println(title);
		
		String url=driver.getCurrentUrl();//https://www.facebook.com/
		System.out.println(url);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);//5 second wait
		
		driver.navigate().back();
		Thread.sleep(5000);//5 second wait
		driver.navigate().forward();
		Thread.sleep(5000);//5 second wait
		driver.navigate().refresh();
		String title1=driver.getTitle();
		System.out.println(title1);//Login • Instagram
		String url1=driver.getCurrentUrl();
		System.out.println(url1);//https://www.instagram.com/accounts/login/
		
		driver.close();
		
	}

}
