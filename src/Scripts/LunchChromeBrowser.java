package Scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
  ChromeDriver driver=new ChromeDriver();
  
  driver.navigate().to("https://online.actitime.com/sba/login.do");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.findElement(By.id("username")).sendKeys("shobushoba1@gmail.com");
  System.out.println("enter the user name");
  driver.findElement(By.name("pwd")).sendKeys("Manager");
  System.out.println("enter the password");
  driver.findElement(By.xpath("//div[.='Login ']")).click();
  System.out.println("clicked on login button");
 Thread.sleep(2000);
  String text= driver.findElement(By.id("logoutLink")).getText();
 System.out.println("text");
 driver.findElement(By.id("logoutLiink")).click();
 System.out.println("clicked on logout button");
  Thread .sleep (4000);
  // driver.close();
     driver.quit();
    
	}

	
		
	}


