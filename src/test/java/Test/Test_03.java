package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_03 {
	public static void main(String []args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Freview%2FR1HE7Y66S5MW2Y%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		WebElement Txt_email=driver.findElement(By.id("email"));
		Txt_email.sendKeys("Harshu@gmail.com");
		 WebElement Txt_password=driver.findElement(By.id("pass"));
		 Txt_password.sendKeys("123456");
		 
		 WebElement btn_login =driver.findElement(By.name("login"));
		 btn_login.click();
		 Thread.sleep(3000);
		 String title1 =driver.getTitle();
		 System.out.println(title1);
		 
		driver.close();
		
	}
	}


