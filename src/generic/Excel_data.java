package generic;

import java.io.FileInputStream;
// how to read data from excel sheet
public class Excel_data {

	public static String getvalue(String path , String sheet, int r ,int c)
	{
		String v="";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			v=wb.getsheet(sheet).getRow(r).getCell.toString();
			
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
	// how many row in sheet
	public static int getRowcount(String path, String sheet )
	{
		int rc=0;
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getsheet(sheet).getLastRowNum();
			
			
		}
		catch(Exception e)
		{}
		return rc;
		
	}
//how many cell in the row
	public static int getCellcount(String path ,String sheet, int r)
	{
		int cc=0;
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			cc=wb.getsheet(sheet).getRow(r).getLastCellNum();
			
		}
		catch (Exception e)
		{}
		return cc;
	}
}
