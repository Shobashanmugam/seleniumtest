package Scripts;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lunchfirefoxbrowser {

public static void main(String[] args) throws InterruptedException {
		
			  System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			  FirefoxDriver driver=new FirefoxDriver();
			  Thread .sleep (4000);
			  driver.navigate().to("https://www.youtube.com/");
			  //driver.get("https://www.facebook.com/");
			   Thread .sleep (4000);
			  // driver.close();
			     driver.quit();
	}

}
