package com.amazon.qa.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
	//------Global Variables------
	public static int rCount;
	public static int colCount;
	public static XSSFWorkbook wrkBook;
	public static XSSFSheet sheet;
	
	//--------Read Excel Data
	public static Object[][] getExcelData(String xlFilePath, int xlsheet) throws IOException
	{
		Object[][] DataFromExcel;
		FileInputStream fis = new FileInputStream(xlFilePath); 
		wrkBook = new XSSFWorkbook(fis);
		sheet = wrkBook.getSheetAt(xlsheet);
		rCount = sheet.getLastRowNum();
		colCount = sheet.getRow(0).getLastCellNum();
		DataFromExcel = new Object[rCount][colCount];
		for(int i=0; i<=rCount; i++)
		{
			for(int j=0; j<=colCount; j++)
			{
				DataFromExcel[i][j] = getCellValue(sheet.getRow(i).getCell(j));
			}
		}
		
		return DataFromExcel;
	}

	private static String getCellValue(XSSFCell cell) 
	{
	    String CellValue = null;
	    if(cell!=null)
	    {
	      switch(cell.getCellTypeEnum())
	      {
	      case NUMERIC:
	    	  CellValue = String.valueOf((cell.getNumericCellValue()));
	    	  break;
	    	  
	      case STRING:
	    	  CellValue = cell.getStringCellValue(); 
	    	  break;
	    	  
	      default:
	    	  break;
	      }
	      return CellValue;
	    }
	    else
	    {
	    	 return CellValue = "";
	    }
		
	}
   
	//-----Write Data into Excelsheet---
	public static void writeDataIntoExcel(String xlFilePath, int xlsheet, String tcDescription, String status) throws IOException
	{
	 
		FileInputStream fis = new FileInputStream(xlFilePath);
		wrkBook = new XSSFWorkbook(fis);
		sheet = wrkBook.getSheetAt(xlsheet);
		rCount = sheet.getLastRowNum();
		for(int i=0; i<=rCount; i++)
		{
			if(sheet.getRow(i).getCell(1).getStringCellValue().equalsIgnoreCase(tcDescription))
			{
				if(status.equalsIgnoreCase("PASS"))
				{
					sheet.getRow(i).createCell(2).setCellValue(status);
				}
				else
				{
					sheet.getRow(i).createCell(2).setCellValue(status);
				}
				
				FileOutputStream fout = new FileOutputStream(xlFilePath);
				try {
					wrkBook.write(fout);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fout.close();
			}
		}
		
		wrkBook.close();
	}
	
}
