package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseTest implements IAutoconstant
{
	
	public WebDriver driver ;
static
{
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	
	}
@Besforemethod(alwaysrun=true)
public void openapp()
{
	String AURL=Autoutils.getProperty(CONFIG_PATH ,"URL");
	String SITO=Autoutils.getProperty(CONFIG_PATH ,"ITO");
	long ITO=Long.parseLong(SITO);
	ChromeDriver d=new ChromeDriver();
	driver.get(AURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds("ITO"));
	
}



@Aftermethod(alwaysrun=true)
public void closeApp(ITestResult ,testResult)

{
	String testname=testresult.getname();
	String status=testresult.getstatus();
	if (status==1)
	{
		Reporter.log(testname+ "pass",true);
	}
	else
	{
		Reporter.log(testname+"failed,true");
		Autoutils.getphoto(driver, IMAGE_PATH, testname);
	}
	get.quit();
	


}
