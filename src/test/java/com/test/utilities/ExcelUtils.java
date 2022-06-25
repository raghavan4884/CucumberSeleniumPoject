package com.test.utilities;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {
	
	public HSSFWorkbook workbook;
	public HSSFSheet sheet;
	public HSSFCell cell;
	public ExcelUtils (String fileName)
	{
		File file=new File(fileName);
		try
		{
			FileInputStream fis=new FileInputStream(file);
			workbook=new HSSFWorkbook(fis);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public int getTotalRows(String sheetName,int row,int cell)
	{
		int totRows=0;
		try
		{
			sheet=workbook.getSheet(sheetName);
			totRows=sheet.getPhysicalNumberOfRows();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return totRows;
	}
	public String getStringValue(String sheetName,int row,int cols)
	{
		String value=null;
		try
		{
			sheet=workbook.getSheet(sheetName);
			value=sheet.getRow(row).getCell(cols).getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	public int getIntValue(String sheetName,int row,int cols)
	{
		int value=0;
		try
		{
			sheet=workbook.getSheet(sheetName);
			value=(int) sheet.getRow(row).getCell(cols).getNumericCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	public void writeToFile(String fileName,String sheetName,int row,int cols,String message)
	{
		try
		{
		File file=new File(fileName);
		sheet=workbook.getSheet(sheetName);
		cell=sheet.getRow(row).createCell(cols);
		cell.setCellValue(message);
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
