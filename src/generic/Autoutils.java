package generic;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;

public class Autoutils {

	

	private static final String FILE = null;
	public static String getproperty;

	public static String getphoto(WeebDriver driver,String folder,String filename) 
	{
		try {
			   String datetime=new Date(0).toString().replace(":","-");
			   String path =folder+filename+datetime+".png";
			   TakesScreenshot t=(TakesScreenshot) driver;
			   Object OutPutType;
			File sourcefile=t.getscreenshootAs(OutPutType,FILE);
			   File destinationfile= new File (path);
			   FileUtils.copyFile(sourcefile, destinationfile);
			   
		}
		catch(Exception e)
		{}
		return filename;
	
	}
	//how to read properties file from property
	public static String getProperty(String path, String key)
	{
		String v="";
		 try {
		Properties p=new properties();
		 p.load(new FileInputStream(path));
		 v=p.getProperty(key);
		 }
		 catch(Exception e)
		 
		 {
			 
		 }
		return v;
	}
}
