package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amozon_Login {

	public static void main(String[] args) throws InterruptedException {
		// TO Opening Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D57684946783%26hvpone%3D%26hvptwo%3D%26hvadid%3D294106218381%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5304560549644043105%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040234%26hvtargid%3Dkwd-297132974063%26hydadcr%3D5870_1738703%26gclid%3DCjwKCAjw9NeXBhAMEiwAbaY4lglqfb-NIg-W8eGuPHSlTPf5jZachsG6Optl2acnEJWNAVyiVy65xxoC8boQAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        driver.manage().window().maximize();
        
        //identify webelement on webpage---> Xpath Locator used
       WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
       txt_email.sendKeys("Test@gmail.com");
       driver.findElement(By.xpath("//input[@id='continue']")).click();
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
       driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
       Thread.sleep(20000);
       driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.close();
       
	}

}
